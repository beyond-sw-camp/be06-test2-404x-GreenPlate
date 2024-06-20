package com.example.Spring404x.user;

import com.example.Spring404x.user.model.UserSignUpReq;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private JdbcTemplate jdbcTemplate;
    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void signUp(UserSignUpReq dto){
        jdbcTemplate.update("INSERT INTO USER(EMAIL,NAME, NICKNAME, BIRTHDAY, PW, CREATED_DATE) VALUES(?,?,?,?,?,NOW()) ",
        dto.getEmail(),
        dto.getName(),
        dto.getNickname(),
        dto.getBirthday(),
        dto.getPw()
        );
    }

}
