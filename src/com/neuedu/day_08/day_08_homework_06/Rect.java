package com.neuedu.day_08.day_08_homework_06;

public class Rect {
    private double height;
    private double width;

    public Rect() {
    }

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return height*width;
    }
    public double getPer(){
        return 2*(height+width);
    }
}
