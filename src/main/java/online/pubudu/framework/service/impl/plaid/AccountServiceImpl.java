package online.pubudu.framework.service.impl.plaid;

import online.pubudu.framework.service.AccountService;
import online.pubudu.framework.service.impl.plaid.dto.AccountDto;
import online.pubudu.framework.service.impl.plaid.dto.AccountResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl  implements AccountService<AccountResponseDto>{

    @Override
    public AccountResponseDto getAccounts() {
        AccountDto account1 = new AccountDto("1234");
        AccountDto account2 = new AccountDto("4567");
        List<AccountDto> accountDtoList = new ArrayList<>();
        accountDtoList.add(account1);
        accountDtoList.add(account2);
        return new AccountResponseDto(accountDtoList);
    }
}
