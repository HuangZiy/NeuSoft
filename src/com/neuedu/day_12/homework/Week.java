package com.neuedu.day_12.homework;

public class Week {
    private int day;

    public Week(int day) {
        this.day = day;
    }

    public void show(){
        switch (day){
            case 1:
                System.out.println("周日");
                break;
            case 2:
                System.out.println("周一");
                break;
            case 3:
                System.out.println("周二");
                break;
            case 4:
                System.out.println("周三");
                break;
            case 5:
                System.out.println("周四");
                break;
            case 6:
                System.out.println("周五");
                break;
            case 7:
                System.out.println("周六");
                break;
            default:
                System.out.println("输入出错请输入1~7");
                break;
        }
    }
}
