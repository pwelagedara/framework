package online.pubudu.framework.config;

import com.fasterxml.classmate.ResolvedType;
import com.fasterxml.classmate.TypeResolver;
import online.pubudu.framework.util.SwaggerConfigUtil;
import online.pubudu.framework.util.SwaggerMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spring.web.plugins.DocumentationPluginsManager;
import springfox.documentation.spring.web.scanners.ApiDescriptionReader;
import springfox.documentation.spring.web.scanners.ApiListingScanner;
import springfox.documentation.spring.web.scanners.ApiModelReader;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Main Swagger Configuration.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String SWAGGER_BASE_PACKAGE = "online.pubudu.framework";
    private static final String SWAGGER_TITLE = "Spring Framework APIs";
    private static final String SWAGGER_DESCRIPTION = "Sample APIs for a Spring Framework";
    private static final String SWAGGER_LICENSE = "MIT";
    private static final String SWAGGER_LICENSE_URL = "https://opensource.org/licenses/MIT";
    private static final String SWAGGER_VERSION= "2.0";

    @Autowired
    private TypeResolver typeResolver;

    @Autowired
    private SwaggerConfigUtil swaggerConfigUtil;

    @Bean
    public Docket api() {

        List<List<SwaggerMethod>> listOfSwaggerMethodsList = swaggerConfigUtil.getTags().values().stream().collect(Collectors.toList());
        Set<String> uniqueClassNames = new HashSet<>();
        listOfSwaggerMethodsList.forEach(s -> {
            s.forEach(r -> {
                r.getResponses().forEach(c -> {
                    uniqueClassNames.add(c.getResponseClass());
                });
            });
        });

        List<ResolvedType> additionalObjectsList = new ArrayList<ResolvedType>();
        uniqueClassNames.forEach(u -> {
            try {
                additionalObjectsList.add(typeResolver.resolve(Class.forName(u)));
            } catch (ClassNotFoundException e) {
                 // Ignored
            }
        });

        ResolvedType[] additionalObjectsArray = additionalObjectsList.toArray(new ResolvedType[uniqueClassNames.size()]);

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .additionalModels(typeResolver.resolve(Object.class), additionalObjectsArray)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(SWAGGER_TITLE)
                .description(SWAGGER_DESCRIPTION)
                .license(SWAGGER_LICENSE)
                .licenseUrl(SWAGGER_LICENSE_URL)
                .version(SWAGGER_VERSION)
                .build();
    }

    @Primary
    @Bean
    public ApiListingScanner addExtraOperations(ApiDescriptionReader apiDescriptionReader, ApiModelReader apiModelReader, DocumentationPluginsManager documentationPluginsManager)
    {
        return new CustomApiListingScanner(apiDescriptionReader, apiModelReader, documentationPluginsManager, swaggerConfigUtil);
    }
}
