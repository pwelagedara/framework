package online.pubudu.framework.service;

import online.pubudu.framework.dto.LoginDto;

public interface LoginService<T> {

    T login(LoginDto loginDto);

}
