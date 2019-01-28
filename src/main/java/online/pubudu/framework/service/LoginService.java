package online.pubudu.framework.service;

import online.pubudu.framework.dto.LoginDto;

/**
 * Interface to be implementd by the Provider for Login APIs.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
public interface LoginService<T> {

    T login(LoginDto loginDto);
}
