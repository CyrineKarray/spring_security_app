package com.example.authproject.User_Entity;

public class User_Entity {

    private final Integer userId;
    private final String userName;

    public User_Entity(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}

