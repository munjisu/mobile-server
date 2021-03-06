package com.mobileserver.repository;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String userId;

    private String userPwd;
    private String userName;

    public User() {
    }

    public User(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }

    public User(String userId, String userPwd, String userName) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
