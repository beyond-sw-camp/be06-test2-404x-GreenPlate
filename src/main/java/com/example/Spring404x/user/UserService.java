package com.example.Spring404x.user;

import com.example.Spring404x.user.model.UserSignUpReq;
import com.example.Spring404x.user.model.UserSignUpRes;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserSignUpRes signUp(UserSignUpReq dto) {
        userRepository.signUp(dto);
        return new UserSignUpRes(dto.getNickname() + "님의 가입을 환영합니다");
    }

}
