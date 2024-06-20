package com.example.Spring404x.user;

import com.example.Spring404x.user.model.UserEditReq;
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

    public void edit(UserEditReq dto) {
        jdbcTemplate.update("UPDATE USER\n" +
                        "SET EMAIL = ?, PW = ?, NAME = ?, NICKNAME = ?,  MODIFIED_DATE = NOW()\n" +
                        "WHERE ID = ?",
                dto.getEmail(),
                dto.getPw(),
                dto.getName(),
                dto.getNickname(),
                dto.getId()
                );
    }
}
