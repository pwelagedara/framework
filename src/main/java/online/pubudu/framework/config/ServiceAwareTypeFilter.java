package online.pubudu.framework.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.stream.Stream;

public class ServiceAwareTypeFilter implements TypeFilter, EnvironmentAware {

    private static final String ANNOTATION_COMPONENT = "org.springframework.stereotype.Component";
    private static final String PROPERTY_PREFIX_SERVICE_IMPLEMENTATION_PACKAGE = "service.implementation.package";

    private String[] activeProfiles;
    private String serviceImplementationPackage;

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        if(!metadataReader.getAnnotationMetadata().hasMetaAnnotation(ANNOTATION_COMPONENT)) {
            return false;
        }

        try {
            String packageName = Class.forName(metadataReader.getClassMetadata().getClassName()).getPackage().getName();
            if(Stream.of(this.activeProfiles).map(a ->  this.serviceImplementationPackage + "." + a).parallel().anyMatch(packageName::contains)){
                return true;
            } else if(!packageName.contains(this.serviceImplementationPackage)) {
                return true;
            }
        } catch (ClassNotFoundException e) {
            // Ignored
        }

        return false;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.activeProfiles = environment.getActiveProfiles();
        this.serviceImplementationPackage = environment.getProperty(PROPERTY_PREFIX_SERVICE_IMPLEMENTATION_PACKAGE);
    }
}
