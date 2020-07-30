package com.neuedu.day_10.stringdemo;

import java.util.Scanner;

import static com.neuedu.day_10.stringdemo.StringTool.empSql;

public class StringBufferDemo {
    public static void main(String[] args) {
//        StringBuffer sb1 = new StringBuffer();
//        System.out.println("初始容量："+sb1.capacity());
//        System.out.println("目前的字符串长度："+sb1.length());
//        sb1.append("select * from emp");
//        System.out.println("初始容量："+sb1.capacity());
//        System.out.println("目前的字符串长度："+sb1.length());
//        sb1.append("select * from emp ");
//        System.out.println("初始容量："+sb1.capacity());
//        System.out.println("目前的字符串长度："+sb1.length());
//        System.out.println("目前的字符串长度："+sb1.length());
//        System.out.println(sb1.toString());
//
//        StringBuffer sb2 = new StringBuffer(8);
//        sb2.append(1000);
//        sb2.append('$');
//        sb2.append(3.14);
//        System.out.println("目前的字符串容量："+sb2.capacity());
//        System.out.println("目前的字符串长度："+sb2.length());
//        System.out.println(sb2.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入部门编号（没有为0）：");
        int dept = sc.nextInt();
        System.out.println("请输入工资（没有为0）：");
        int sal = sc.nextInt();
        System.out.println("请输入奖金（没有为0）：");
        int comm = sc.nextInt();
        String sql=empSql(dept,sal,comm);
        System.out.println(sql);
        System.out.println(sql);

    }
}
