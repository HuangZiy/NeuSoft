package com.neuedu.day_08.day_08_homework_12;

public abstract class Shape {
    private double length;
    private double area;

    public void setLength(double length) {
        this.length = length;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public abstract double getLength();
    public abstract double getArea();

    public void show(){
        System.out.println(length+","+area);
    }
}
