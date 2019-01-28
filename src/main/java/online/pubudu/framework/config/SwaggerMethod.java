package online.pubudu.framework.config;

public class SwaggerMethod {

    private String url;

    private String method;

    private int code;

    private String message;

    private String responseClass;

    public SwaggerMethod() {
    }

    public SwaggerMethod(String url, String method, int code, String message, String responseClass) {
        this.url = url;
        this.method = method;
        this.code = code;
        this.message = message;
        this.responseClass = responseClass;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponseClass() {
        return responseClass;
    }

    public void setResponseClass(String responseClass) {
        this.responseClass = responseClass;
    }
}
