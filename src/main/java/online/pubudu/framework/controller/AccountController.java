package online.pubudu.framework.controller;

import online.pubudu.framework.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public ResponseEntity<?> login() {
        return new ResponseEntity<>(accountService.getAccounts(), HttpStatus.OK);
    }
}
