package com.reflect;

/**
 * @author LiYang
 * @version 1.0
 * @date 2019/8/6 21:12
 */
public class UserEntity {
    private String username;

    public UserEntity(){

    }

    public  UserEntity(String s){
        this.username = s;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
