package com.neuedu.day_10.stringdemo;

public class StringDemo01 {
    public static void main(String[] args) {
        String str1 = "neusoft";
        String str2 = "234";
        String str3 = "neusoft";
        System.out.println(str1==str3);
        str2=str1.concat(str2);
        System.out.println(str2);
        change(str1,str2);
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void change(String str1,String str2){
        String t;
        t=str1;
        str1=str2;
        str2=t;
    }
}
