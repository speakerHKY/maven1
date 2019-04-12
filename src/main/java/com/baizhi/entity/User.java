package com.baizhi.entity;


import javax.persistence.Table;

@Table(name = "t_user")
public class User {
    private int id;
    private String username;
    private String pwd;
    private int sex;

    public User(int id, String username, String pwd, int sex) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.sex = sex;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex=" + sex +
                '}';
    }
}
