package online.pubudu.framework.util;

import java.util.ArrayList;
import java.util.List;

public class SwaggerMethod {

    private String url;

    private String method;

    private List<SwaggerResponse> responses = new ArrayList<>();

    public SwaggerMethod() {
    }

    public SwaggerMethod(String url, String method, List<SwaggerResponse> responses) {
        this.url = url;
        this.method = method;
        this.responses = responses;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<SwaggerResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<SwaggerResponse> responses) {
        this.responses = responses;
    }
}
