package com.neuedu.day_10.homework;

import java.util.Scanner;

public class work_04 {
    public static int strNub( String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int count = 0;
        for(int i=0;i<=s1.length()-s2.length();i++){
            boolean isEquals = s2.equals(s1.substring(i,i+s2.length()));
            if (c1[i]==c2[0]&&isEquals){
                count++;
                i+=s2.length();
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count=strNub(s1,s2);
        System.out.println(count);
    }

}
