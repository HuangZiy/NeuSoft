package com.neuedu.day_11.datedemo;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date cur = new Date();
        System.out.println(cur.toString());

        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(d.toString());

        int year = c.get(Calendar.YEAR);
        System.out.println("当前年份是；"+year);
        int month = c.get(Calendar.MONTH);
        System.out.println("当前月份是："+(month+1));
        int date = c.get(Calendar.DATE);
        System.out.println("当前日期是："+date);
        int hour = c.get(Calendar.HOUR);
        System.out.println("当前小时为："+hour);

        c.set(1998,11,25,05,25,55);
        d=c.getTime();
        System.out.println(d);
    }

}
