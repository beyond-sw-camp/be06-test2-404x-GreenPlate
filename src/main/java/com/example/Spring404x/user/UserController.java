package com.example.Spring404x.user;

import com.example.Spring404x.user.model.UserEditReq;
import com.example.Spring404x.user.model.UserEditRes;
import com.example.Spring404x.user.model.UserSignUpReq;
import com.example.Spring404x.user.model.UserSignUpRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/signup")
    public ResponseEntity<UserSignUpRes> signup(@RequestBody UserSignUpReq dto) {
        UserSignUpRes res = userService.signUp(dto);
        return ResponseEntity.ok(res);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/edit")
    public ResponseEntity<UserEditRes> edit(@RequestBody UserEditReq dto) {
        UserEditRes res = userService.edit(dto);
        return ResponseEntity.ok(res);
    }
}
