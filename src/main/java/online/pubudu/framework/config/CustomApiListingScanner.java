package online.pubudu.framework.config;

import com.google.common.collect.Multimap;
import online.pubudu.framework.util.SwaggerConfigUtil;
import online.pubudu.framework.util.SwaggerMethod;
import org.springframework.http.HttpMethod;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiListing;
import springfox.documentation.spring.web.plugins.DocumentationPluginsManager;
import springfox.documentation.spring.web.scanners.ApiDescriptionReader;
import springfox.documentation.spring.web.scanners.ApiListingScanner;
import springfox.documentation.spring.web.scanners.ApiListingScanningContext;
import springfox.documentation.spring.web.scanners.ApiModelReader;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CustomApiListingScanner extends ApiListingScanner {

    private SwaggerConfigUtil swaggerConfigUtil;

    public CustomApiListingScanner(ApiDescriptionReader apiDescriptionReader, ApiModelReader apiModelReader, DocumentationPluginsManager documentationPluginsManager,SwaggerConfigUtil swaggerConfigUtil) {
        super(apiDescriptionReader, apiModelReader, documentationPluginsManager);
        this.swaggerConfigUtil =swaggerConfigUtil;
    }

    @Override
    public Multimap<String, ApiListing> scan(ApiListingScanningContext context) {

        final Multimap<String, ApiListing> def = super.scan(context);

        for (Map.Entry<String, List<SwaggerMethod>> pair : swaggerConfigUtil.getTags().entrySet()){

            Collection<ApiListing> apiListingCollection = def.get(pair.getKey());
            pair.getValue().forEach(m -> {

                m.getResponses().forEach(r -> {

                    ((ApiListing) ((AbstractSequentialList) apiListingCollection).get(0)).getApis().forEach(a -> {

                            if ( a.getPath().equals(m.getUrl()) && a.getOperations().get(0).getMethod() == HttpMethod.valueOf(m.getMethod())) {
                                a.getOperations().get(0).getResponseMessages().remove(new ResponseMessageBuilder().code(r.getCode()).build());
                                try {
                                    a.getOperations().get(0).getResponseMessages().add(new ResponseMessageBuilder().code(r.getCode()).message(r.getMessage()).responseModel(new ModelRef(Class.forName(r.getResponseClass()).getSimpleName())).build());
                                } catch (ClassNotFoundException e) {
                                    // Ignored
                                }
                            }
                        }
                    );
                });
            });
            def.putAll(pair.getKey(), apiListingCollection);
        }
        return def;
    }
}
