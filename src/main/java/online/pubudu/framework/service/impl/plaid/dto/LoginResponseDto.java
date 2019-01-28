package online.pubudu.framework.service.impl.plaid.dto;

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
