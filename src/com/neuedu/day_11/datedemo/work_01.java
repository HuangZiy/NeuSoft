package com.neuedu.day_11.datedemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class work_01 {
    public static void bjTime(int year, int month, int date, int hour, int minute, int second) {
        int bh = hour;
        int ph = hour - 7;
        int nh = hour - 12;
        Date b;
        Date p;
        Date n;
        String pattern = "yyyy年MM月dd日 HH时mm分ss秒";
        Calendar c = Calendar.getInstance();
        c.set(year, month, date, bh, minute, second);
        b = c.getTime();
        c.set(year, month, date, ph, minute, second);
        p = c.getTime();
        c.set(year, month, date, nh, minute, second);
        n = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(b));
        System.out.println(sdf.format(p));
        System.out.println(sdf.format(n));
    }

    public static void main(String[] args) {
        bjTime(2008, 7, 8, 20, 8, 8);
    }
}
