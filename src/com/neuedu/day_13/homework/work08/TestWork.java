package com.neuedu.day_13.homework.work08;

public class TestWork {
    public static void main(String[] args) {
        Work work = new Work();
        System.out.println("初始化...");
//        System.out.println("第一个重复的数字：");
        work.init();
//        System.out.println("各个数字出现的次数：");
//        work.nums();
        System.out.println("次数最多：");
        work.maxRepeat();
    }
}
