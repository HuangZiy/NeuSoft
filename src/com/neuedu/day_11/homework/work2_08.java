package com.neuedu.day_11.homework;

    public class work2_08 {

        public static void main(String[] args) {

            StringBuffer str1 = new StringBuffer("hjh");

            StringBuffer tmp = new StringBuffer(str1);

            StringBuffer str2 = new StringBuffer(tmp.reverse());

            System.out.println(str1);

            System.out.println(str2);

            System.out.println(str1.equals(str2));

        }

    }
    //false

