package com.neuedu.day_14.homework;

import java.sql.Date;

public class User {
    private String name;
    private String pwd;
    private String email;
    private Date date;

    public User() {
    }

    public User(String name, String pwd, String email, Date date) {
        this.name = name;
        this.pwd = pwd;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
