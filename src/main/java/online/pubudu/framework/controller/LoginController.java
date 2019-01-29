package online.pubudu.framework.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import online.pubudu.framework.dto.ErrorDto;
import online.pubudu.framework.dto.LoginDto;
import online.pubudu.framework.service.LoginService;
import online.pubudu.framework.service.impl.yodlee.LoginServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample Login Controller.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiResponses(value = {
                @ApiResponse(code = 400, message = "Bad Request", response = ErrorDto.class)
            }
    )
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto) {
        return new ResponseEntity<>(loginService.login(loginDto), HttpStatus.OK);
    }

    @GetMapping("/login")
    public String login() {return "OK";}

    @GetMapping("/m1")
    public String m1() {return "OK";}

    @GetMapping("/m2")
    public String m2() {return "OK";}

}
