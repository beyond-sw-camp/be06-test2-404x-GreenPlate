package com.example.Spring404x.user;

import com.example.Spring404x.User.model.UserLoginReq;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    private UserLoginRepository userLoginRepository;

    public UserLoginService(UserLoginRepository userLoginRepository) {
        this.userLoginRepository = userLoginRepository;
    }

    public Boolean login(UserLoginReq dto) {
        Boolean result = false;
        result = userLoginRepository.login(dto);
        return result;
    }
}
