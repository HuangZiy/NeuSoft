package com.neuedu.day_09.stackdemo01;

public class stack01 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        String a = "1";
        String b = new String("1");
        System.out.println(a.equals(b));
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
}
