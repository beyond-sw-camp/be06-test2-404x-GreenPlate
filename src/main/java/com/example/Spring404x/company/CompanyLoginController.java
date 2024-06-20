package com.example.Spring404x.company;

import com.example.Spring404x.company.model.CompanyLoginReq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class CompanyLoginController {
    private CompanyLoginService companyLoginService;

    public CompanyLoginController(CompanyLoginService companyLoginService) {
        this.companyLoginService = companyLoginService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/company")
    public ResponseEntity<Boolean> loginCompany(@RequestBody CompanyLoginReq dto){
        boolean response = companyLoginService.login(dto);
        return ResponseEntity.ok(response);
    }

}
