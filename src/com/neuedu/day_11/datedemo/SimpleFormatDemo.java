package com.neuedu.day_11.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFormatDemo {
    public static void main(String[] args) throws ParseException {
        String strDate = "2020-5-1";
        String strDate1 = "2020年5月1日 13时30分30秒";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date d1 = sdf1.parse(strDate1);
        Date d = sdf.parse(strDate);
        System.out.println(d);
        System.out.println(sdf1.format(d1));
    }
}
