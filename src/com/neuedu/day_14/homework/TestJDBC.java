package com.neuedu.day_14.homework;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestJDBC {
    public static void main(String[] args) {
        JDBC jdbc = new JDBC();
        List<User> users = new ArrayList<>();
        jdbc.init();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        java.util.Date ud1;
        java.util.Date ud2;
        java.util.Date ud3;
        try {
            ud1 = sdf.parse("1986-10-11");
            ud2 = sdf.parse("1988-10-23");
            ud3 = sdf.parse("1986-10-11");
            Date d1 = new Date(ud1.getTime());
            Date d2 = new Date(ud2.getTime());
            Date d3= new Date(ud3.getTime());
            Date d4= new Date(calendar.getTime().getTime());

            User u1 = new User("张三","888888","zhangsan@126.com",d1);
            User u2 = new User("李四","999999","lisi@126.com",d2);
            User u3 = new User("王五","888888","zhangsan@126.com",d3);
            User u4 = new User("张三","888888","zhangsan@126.com",d4);


            users.add(u1);
            users.add(u2);
            users.add(u3);
            System.out.println("插入开始");
            for (User u:users
                 ) {
                jdbc.insertUser(u);
            }
            System.out.println("更新开始");
            jdbc.updateUser(u4);
            System.out.println("删除开始");
            jdbc.deleteUser(u2);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
