package com.neuedu.day_08.day_08_homework_12;

public class Circle extends Shape {
    final double PI = 3.14;
    private double r ;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getLength() {
        return 2*PI*r;
    }

    @Override
    public double getArea() {
        return Math.pow(r,2)*PI;
    }
}
