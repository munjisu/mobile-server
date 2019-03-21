package com.mobileserver.repository;

import org.springframework.data.annotation.Id;

public class ActiveUser {

    @Id
    private String userId;

    private String activeTime;

    public ActiveUser() {
    }

    public ActiveUser(String userId, String activeTime) {
        this.userId = userId;
        this.activeTime = activeTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    @Override
    public String toString() {
        return "ActiveUser{" +
                "userId='" + userId + '\'' +
                ", activeTime='" + activeTime + '\'' +
                '}';
    }
}
