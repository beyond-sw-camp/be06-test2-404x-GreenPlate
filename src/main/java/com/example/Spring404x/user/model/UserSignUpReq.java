package com.example.Spring404x.user.model;

public class UserSignUpReq {
    private String email;
    private String name;
    private String nickname;
    private String birthday;
    private String pw;

    public UserSignUpReq(String email, String name, String nickname, String birthday, String pw) {
        this.email = email;
        this.name = name;
        this.nickname = nickname;
        this.birthday = birthday;
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
