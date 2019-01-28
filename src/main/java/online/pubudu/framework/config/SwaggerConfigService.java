package online.pubudu.framework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@ConfigurationProperties(prefix = "swagger")
public class SwaggerConfigService {

    private Map<String, List<SwaggerMethod>> tags = new HashMap<String, List<SwaggerMethod>>();

    public SwaggerConfigService() {
    }

    public SwaggerConfigService(Map<String, List<SwaggerMethod>> tags) {
        this.tags = tags;
    }

    public Map<String, List<SwaggerMethod>> getTags() {
        return tags;
    }

    public void setTags(Map<String, List<SwaggerMethod>> tags) {
        this.tags = tags;
    }
}