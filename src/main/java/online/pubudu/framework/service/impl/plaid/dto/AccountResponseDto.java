package online.pubudu.framework.service.impl.plaid.dto;

import java.util.List;

/**
 * Account Response Dto for Plaid.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
public class AccountResponseDto {

    private List<AccountDto> accounts;

    public AccountResponseDto() {
    }

    public AccountResponseDto(List<AccountDto> accounts) {
        this.accounts = accounts;
    }

    public List<AccountDto> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountDto> accounts) {
        this.accounts = accounts;
    }
}
