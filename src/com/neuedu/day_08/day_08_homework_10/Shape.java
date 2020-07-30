package com.neuedu.day_08.day_08_homework_10;

public class Shape {
    private double per;
    private double area;

    public Shape() {
    }

    public Shape(double per) {
        this.per = per;
    }

    public void setPer(double per) {
        this.per = per;
    }
    public void show(){
        System.out.println(per);
    }
}
