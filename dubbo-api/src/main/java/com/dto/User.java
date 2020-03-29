package com.dto;

import java.io.Serializable;

/**
 * @Author: zxx
 * @Date: 2020/3/27 22:10
 * @Description: *
 */
public class User implements Serializable {
    private String userid;
    private String username;

    public User(String userid, String username) {
        this.userid=userid;
        this.username=username;
    }

    public User() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid=userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
