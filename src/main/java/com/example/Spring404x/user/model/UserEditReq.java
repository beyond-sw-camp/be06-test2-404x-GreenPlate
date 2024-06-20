package com.example.Spring404x.user.model;

public class UserEditReq {
    private int id;
    private String email;
    private String pw;
    private String name;
    private String nickname;

    public UserEditReq(int id, String email, String pw, String name, String nickname) {
        this.id = id;
        this.email = email;
        this.pw = pw;
        this.name = name;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
