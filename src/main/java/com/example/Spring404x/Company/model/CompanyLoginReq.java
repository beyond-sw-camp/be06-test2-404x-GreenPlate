package com.example.Spring404x.Company.model;

public class CompanyLoginReq {
    private String email;
    private String pw;

    public CompanyLoginReq(String email, String pw) {
        this.email = email;
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
