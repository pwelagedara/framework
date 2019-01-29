package online.pubudu.framework.service.impl.yodlee;

import online.pubudu.framework.controller.LoginController;
import online.pubudu.framework.dto.LoginDto;
import online.pubudu.framework.service.LoginService;
import online.pubudu.framework.service.impl.yodlee.dto.LoginResponseDto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Login Service implementation for Yodlee.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 * @see online.pubudu.framework.service.LoginService
 */
@Service
public class LoginServiceImpl implements LoginService<LoginResponseDto>{

    private static final Log LOG = LogFactory.getLog(LoginServiceImpl.class);

    @Cacheable(value = "loginResponses", key = "#loginDto.guid")
    @Override
    public LoginResponseDto login(LoginDto loginDto) {
        LOG.info("[INFO]: Not bypassing the cache...");
        return new LoginResponseDto("1234", "5678");
    }

    public void m(){

    }
}
