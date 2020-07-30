package com.neuedu.day_14;

import com.neuedu.day_14.dao.Dao;

public class TestMyUser {
    public static void main(String[] args) {
        Dao dao = new Dao();
        String uid = "caocao";
        String pwd = "456789";
        dao.initJDBC();
        dao.login(uid,pwd);
    }
}
