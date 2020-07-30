package com.neuedu.day_08.day_08_homework_05;

public class PlainRect extends Rect {
    private int startX;
    private int startY;

    public PlainRect(int width, int height, int startX, int startY) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    public PlainRect() {
        startX=0;
        startY=0;
    }

    public boolean isInside(double x,double y){
        if (x >= startX && x <= (startX + width) && y >=(startY - height) && y <= startY){
            return true;
        }
        return false;
    }
}
