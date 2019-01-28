package online.pubudu.framework.service.impl.yodlee;

import online.pubudu.framework.dto.LoginDto;
import online.pubudu.framework.service.LoginService;
import online.pubudu.framework.service.impl.yodlee.dto.LoginResponseDto;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService<LoginResponseDto>{

    @Override
    public LoginResponseDto login(LoginDto loginDto) {
        return new LoginResponseDto("1234", "5678");
    }

    public void m(){

    }
}
