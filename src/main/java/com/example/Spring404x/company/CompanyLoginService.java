package com.example.Spring404x.company;

import com.example.Spring404x.company.model.CompanyLoginReq;
import org.springframework.stereotype.Service;

@Service
public class CompanyLoginService {
    private CompanyLoginRepository companyLoginRepository;

    public CompanyLoginService(CompanyLoginRepository companyLoginRepository) {
        this.companyLoginRepository = companyLoginRepository;
    }

    public Boolean login(CompanyLoginReq dto) {
        Boolean result = false;
        result = companyLoginRepository.login(dto);
        return result;
    }
}
