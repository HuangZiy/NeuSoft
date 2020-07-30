package com.neuedu.day_09.child;

public class Test {
    public static void main(String[] args) {
        Utilty util = new Son();
        ((Son) util).use();
    }

}
