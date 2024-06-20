package com.example.Spring404x.Company;

import com.example.Spring404x.Company.model.CompanyLoginReq;
import com.example.Spring404x.Company.model.CompanyLoginRes;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyLoginRepository {

    private JdbcTemplate jdbcTemplate;

    public CompanyLoginRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean login(CompanyLoginReq dto) {
        CompanyLoginRes companyLoginRes = null;
        try {
            companyLoginRes = jdbcTemplate.queryForObject(
                    "Select email, pw From company where email=? and pw=?",
                    (rs, rowNum) -> {
                        CompanyLoginRes response = new CompanyLoginRes(
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

        if(companyLoginRes != null){
            return true;
        }else{
            return false;
        }
    }
}
