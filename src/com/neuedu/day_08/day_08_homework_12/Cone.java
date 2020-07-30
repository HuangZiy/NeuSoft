package com.neuedu.day_08.day_08_homework_12;

public class Cone{
    private Shape bottom;
    private double height;

    public Shape getBottom() {
        return bottom;
    }

    public Cone(Shape bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public void setBottom(Shape bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return (bottom.getArea()*height)/3;
    }
}
