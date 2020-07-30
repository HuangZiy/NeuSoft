package com.neuedu.day_11.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTool {
    public static Date getDate(int year,int month,int date){
        Calendar c = Calendar.getInstance();
        c.set(year,month-1,date);
        Date d = c.getTime();
        return d;
    }
//    public static Date getDate(String hour,String minute,String second){
//        Calendar c = Calendar.getInstance();
//        c.set(Integer.parseInt(hour),Integer.parseInt(minute),Integer.parseInt(second));
//        Date d = c.getTime();
//        return d;
//    }
    public static String getDateString(Date d,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(d);
    }
    public static Date parseDate(String strDate,String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(strDate);
    }
}
