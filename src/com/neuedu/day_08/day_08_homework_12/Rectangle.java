package com.neuedu.day_08.day_08_homework_12;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getLength() {
        return 2*(height+width);
    }

    @Override
    public double getArea() {
        return height*width;
    }
}
