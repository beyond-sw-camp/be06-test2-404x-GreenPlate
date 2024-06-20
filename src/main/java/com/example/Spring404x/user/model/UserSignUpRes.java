package com.example.Spring404x.user.model;

public class UserSignUpRes {
    private String nickname;

    public UserSignUpRes(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
