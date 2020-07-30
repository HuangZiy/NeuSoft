package com.neuedu.day_11.homework;

public class work2_07 {

    public static void main(String[] args){

        String s1 = "hello";

        String s2 = "hello";

        String s3 = new String("hello");

        String s4 = new String("hello");



        System.out.println(s1.equals(s2));//true

        System.out.println(s2.equals(s3));//true

        System.out.println(s3.equals(s4));//true

        System.out.println(s1 == s2);//true

        System.out.println(s2 == s3);//false

        System.out.println(s3 == s4);//false




        String sa = "ab";

        String sb = "cd";

        String sab=sa+sb;

        String s="abcd";

        System.out.println(sab==s);//false

        sab=sa.concat(sb);

        System.out.println(sab==s);//false

        System.out.println(sab.equals(s));//true




        String sc="ab"+"cd";

        String sd="abcd";

        System.out.println(sc==sd);//false XX true




        String str = "String";

        String anotherStr = "string";

        Object objstr = str;

        System.out.println(str.compareTo(anotherStr));//false  XX -32

        System.out.println(str.compareToIgnoreCase(anotherStr));//true XX 0

        System.out.println(str.compareTo(objstr.toString()));//true XX 0




        StringBuffer str1 = new StringBuffer("abc");

        StringBuffer str2 = new StringBuffer("abc");

        System.out.println(str1==str2);//false

        System.out.println(str1.toString()==str2.toString());//true  XX false

        System.out.println(str1.equals(str2));//false

        String a=str1.toString();

        String b=str2.toString();

        System.out.println(a==b);//true  XX false

        System.out.println(a.equals(b));//true







    }

}
