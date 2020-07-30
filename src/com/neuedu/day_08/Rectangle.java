package com.neuedu.day_08;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width,String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void per(){
        System.out.println("该图形的周长为："+2*(length+width));
    }
    public void area(){
        System.out.println("该图形的面积为："+length*width);
    }
    public void display(){
        super.display();
        per();
        area();
    }
}
