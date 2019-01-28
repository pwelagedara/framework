package online.pubudu.framework.service.impl.yodlee.dto;

import java.math.BigDecimal;

/**
 * Account Dto for Yodlee.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
public class AccountDto {

    private String accountNumber;
    private BigDecimal balance;

    public AccountDto() {
    }

    public AccountDto(String accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
