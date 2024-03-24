package com.max.domain;

/**
 * ClassName: User
 * Package: com.max.domain
 * Description: 用户类，一个用户对象对应数据库中用户表一条数据
 *
 * @Author MaxSun
 * @Create 2024/3/20 19:13
 * @Version 1.0
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private String image;
    private String github;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }
}
