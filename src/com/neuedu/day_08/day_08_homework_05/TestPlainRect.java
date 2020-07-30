package com.neuedu.day_08.day_08_homework_05;

public class TestPlainRect {
    public static void main(String[] args) {
        PlainRect plainRect = new PlainRect(10,20,10,10);
        System.out.println((plainRect.getArea()));
        System.out.println((plainRect.getPer()));
        System.out.println(plainRect.isInside(25.5,13));
    }
}
