package online.pubudu.framework.service.impl.yodlee.dto;

import java.util.List;

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
