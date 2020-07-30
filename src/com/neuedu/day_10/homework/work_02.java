package com.neuedu.day_10.homework;

public class work_02 {
    public static void main(String[] args) {
        int count=0;
        for (String s:args) {
            for (int i = 0; i < s.length() ; i++) {
                char[] ss = s.toCharArray();
                if (ss[i]==('e')){
                    count++;
                }
            }
        }
        System.out.println("字符“e”出现的次数为："+count);
    }
}
