package online.pubudu.framework.dto;

/**
 * Login Dto.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
public class LoginDto {

    private String guid;

    public LoginDto() {
    }

    public LoginDto(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
