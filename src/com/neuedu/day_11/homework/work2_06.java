package com.neuedu.day_11.homework;

public class work2_06 {
    static void test(int x){

        System.out.println("int");

    }
    //10

    static void test(long x){

        System.out.println("long");

    }

    static void test(Integer x){

        System.out.println("Integer");

    }

    static void test(Long x){

        System.out.println("Long");

    }

    public static void main(String[] args) {
        byte x = 10;
        test(x);
        test(x);
        test(x);
        test(x);
    }
}
