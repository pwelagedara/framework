package online.pubudu.framework.service.impl.plaid;

import online.pubudu.framework.dto.LoginDto;
import online.pubudu.framework.service.LoginService;
import online.pubudu.framework.service.impl.plaid.dto.LoginResponseDto;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl  implements LoginService<LoginResponseDto>{

    @Override
    public LoginResponseDto login(LoginDto loginDto) {
        return new LoginResponseDto("9012");
    }
}
