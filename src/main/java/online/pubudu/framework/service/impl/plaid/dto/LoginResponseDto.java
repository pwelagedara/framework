package online.pubudu.framework.service.impl.plaid.dto;

/**
 * Login Response Dto for Plaid.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
public class LoginResponseDto {

    private String session;

    public LoginResponseDto() {
    }

    public LoginResponseDto(String session) {
        this.session = session;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
