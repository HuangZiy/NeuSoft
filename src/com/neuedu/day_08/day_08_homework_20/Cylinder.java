package com.neuedu.day_08.day_08_homework_20;

public class Cylinder implements C {
    private double radius;
    private double height;
    private String color;
    @Override
    public void volume() {
        System.out.println(area()*height);
    }

    @Override
    public double area() {
        return radius*PI*radius;
    }

    @Override
    public void setColor(String c) {
        System.out.println("颜色为："+c);
    }
}
