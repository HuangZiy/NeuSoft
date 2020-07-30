package com.neuedu.day_11.homework;

class work2_02 {

    public static void main(String args[]) {

        String[] s = {"1", "2"};

        mb_swap(s[0], s[1]);

        System.out.print(s[0] + s[1]);

    }

    static void mb_swap(String s0, String s1) {

        String t = s0;

        s0 = s1;

        s1 = t;

    }
}

    //12 , 传参的不是值是地址