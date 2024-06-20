package com.example.Spring404x.user;

import com.example.Spring404x.user.model.UserLoginReq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UserLoginController {
    private UserLoginService userLoginService;

    public UserLoginController(UserLoginService userLoginService) {
        this.userLoginService = userLoginService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public ResponseEntity<Boolean> loginUser(@RequestBody UserLoginReq dto){
        boolean response = userLoginService.login(dto);
        return ResponseEntity.ok(response);
    }

}
