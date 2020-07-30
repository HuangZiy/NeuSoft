package com.neuedu.day_08.day_08_homework_05;

public class Rect {
    protected int width;
    protected int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rect() {
        width=10;
        height=10;
    }

    public int getArea(){
        return width*height;
    }

    public int getPer(){
        return 2*(width*height);
    }
}
