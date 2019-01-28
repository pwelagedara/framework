package online.pubudu.framework.service.impl.plaid.dto;

public class AccountDto {

    private String accountNumber;

    public AccountDto() {
    }

    public AccountDto(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
