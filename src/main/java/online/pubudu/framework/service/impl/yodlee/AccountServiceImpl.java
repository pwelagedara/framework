package online.pubudu.framework.service.impl.yodlee;

import online.pubudu.framework.service.AccountService;
import online.pubudu.framework.service.impl.yodlee.dto.AccountDto;
import online.pubudu.framework.service.impl.yodlee.dto.AccountResponseDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService<AccountResponseDto>{

    @Override
    public AccountResponseDto getAccounts() {
        AccountDto account1 = new AccountDto("1234", BigDecimal.valueOf(100));
        AccountDto account2 = new AccountDto("4567", BigDecimal.valueOf(200));
        List<AccountDto> accountDtoList = new ArrayList<>();
        accountDtoList.add(account1);
        accountDtoList.add(account2);
        return new AccountResponseDto(accountDtoList);
    }
}
