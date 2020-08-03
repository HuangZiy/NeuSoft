package com.neuedu.day_19.homework;

public class work04 {
    public static void main(String[] args) {
        int x = 5;
        work04 p = new work04();
        p.doStuff(x);
        System.out.print(" main x = " + x);
    }

    void doStuff(int x) {
        System.out.println(" doStuff x = " + x++);
    }
}
