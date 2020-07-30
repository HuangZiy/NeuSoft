package com.neuedu.day_08.day_08_homework_06;

public class Cuboid extends Rect {
    private double height;
    private double width;
    private double high;

    public Cuboid(double height, double width, double high) {
        super(height,width);
        this.height = height;
        this.width = width;
        this.high = high;
    }


    public double getVolume(){
        return this.getArea()*high;
    }
}
