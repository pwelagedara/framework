package online.pubudu.framework.util;

/**
 * To read Swagger Properties.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
public class SwaggerResponse {

    private int code;

    private String message;

    private String responseClass;

    public SwaggerResponse() {
    }

    public SwaggerResponse(int code, String message, String responseClass) {
        this.code = code;
        this.message = message;
        this.responseClass = responseClass;
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
