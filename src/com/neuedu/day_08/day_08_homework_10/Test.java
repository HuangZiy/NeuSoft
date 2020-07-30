package com.neuedu.day_08.day_08_homework_10;

public class Test {
    public static void main(String[] args) {
        Shape a = new Shape();
        Shape b = new Shape();
        Rect rect = new Rect(4,6);
        Circle circle = new Circle(4);
        a.setPer(rect.getPer());
        a.show();
        b.setPer(circle.getPer());
        b.show();
    }
}
