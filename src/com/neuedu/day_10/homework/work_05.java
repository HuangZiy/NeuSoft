package com.neuedu.day_10.homework;

public class work_05 {
    public static void charCount(String str){
        int cnCount = 0;
        int enCount = 0;
        int numCount = 0;
        char[] chars = str.toCharArray();
        for (char c:chars) {
            if (c>='\u4e00'&&c<='\u9fa5'){
                cnCount++;
            }else if(c>='0'&&c<='9'){
                numCount++;
            }else if ((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                enCount++;
            }
        }
        System.out.println("中文字符个数："+cnCount+"，英文字符个数："+enCount+"数字字符个数："+numCount);
    }

    public static void main(String[] args) {
        String str = "123qwe一二三你好啊";
        charCount(str);
    }

}
