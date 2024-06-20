package com.example.Spring404x.user;

import com.example.Spring404x.user.model.UserLoginReq;
import com.example.Spring404x.user.model.UserLoginRes;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserLoginRepository {

    private JdbcTemplate jdbcTemplate;

    public UserLoginRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean login(UserLoginReq dto) {
        UserLoginRes userLoginRes = null;
        try {
            userLoginRes = jdbcTemplate.queryForObject(
                    "Select email, pw From user where email=? and pw=?",
                    (rs, rowNum) -> {
                        UserLoginRes response = new UserLoginRes(
                                rs.getString("email"),
                                rs.getString("pw")
                        );
                        return response;
                    }
                    ,dto.getEmail()
                    ,dto.getPw()
            );
        } catch (IncorrectResultSizeDataAccessException error) { // 쿼리문에 해당하는 결과가 없거나 2개 이상일 때
            return false;
        }

        if(userLoginRes != null){
            return true;
        }else{
            return false;
        }
    }
}
