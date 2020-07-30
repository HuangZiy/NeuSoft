package com.neuedu.day_08.day_08_homework_10;

public class Circle extends Shape {
    final double pi=3.14;
    private double r;

    public Circle(double r) {
        this.r=r;
    }

    double getPer(){
        return 2*pi*r;
    }
}
