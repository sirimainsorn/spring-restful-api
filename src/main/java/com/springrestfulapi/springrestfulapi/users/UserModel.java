package com.springrestfulapi.springrestfulapi.users;

public class UserModel {
    private Integer userId;
    private String username;

    public UserModel(Integer userId, String username){
        this.userId = userId;
        this.username = username;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
} 