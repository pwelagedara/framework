package online.pubudu.framework.service.impl.yodlee.dto;

public class LoginResponseDto {

    private String cobSession;

    private String userSession;

    public LoginResponseDto() {
    }

    public LoginResponseDto(String cobSession, String userSession) {
        this.cobSession = cobSession;
        this.userSession = userSession;
    }

    public String getCobSession() {
        return cobSession;
    }

    public void setCobSession(String cobSession) {
        this.cobSession = cobSession;
    }

    public String getUserSession() {
        return userSession;
    }

    public void setUserSession(String userSession) {
        this.userSession = userSession;
    }
}
