package com.neuedu.day_19.homework;

public class work18 {

    public static void main(String[] args) {

        Integer x = 400;

        Integer y = x;

        x++;

        StringBuilder sb1 = new StringBuilder("123");

        StringBuilder sb2 = sb1;

        sb1.append("5");

        System.out.println((x == y) + " " + (sb1 == sb2));

    }

}

