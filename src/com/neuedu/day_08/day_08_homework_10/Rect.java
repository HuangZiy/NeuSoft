package com.neuedu.day_08.day_08_homework_10;

public class Rect {
    private double height;
    private double width;

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getPer(){
        return 2*(height+width);
    }

}
