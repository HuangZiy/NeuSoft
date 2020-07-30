package com.neuedu.day_10.stringdemo;

import java.nio.charset.Charset;

public class StringDemo02 {
    public static void main(String[] args) {
        String str1 = "neusoft";
        char[] cs = str1.toCharArray();
//        for (char c:cs
//             ) {
//            System.out.println(c);
//        }
//        System.out.println(cs);

//        byte []bs = str1.getBytes();
//        for (byte b:bs
//             ) {
//            System.out.println(b);
//        }
        System.out.println(Charset.defaultCharset());
        String str4 = "中";
        byte[] nbs = str4.getBytes();
        for (byte b : nbs
        ) {
            System.out.println(b);
        }

        String str5 = new String(nbs);
        System.out.println(str5);
    }
}
