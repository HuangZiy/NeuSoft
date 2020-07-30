package com.neuedu.day_08;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void display(){
        System.out.println("该图像的颜色为："+color);
    }
}
