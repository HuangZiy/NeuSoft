package com.neuedu.day_08;

public abstract class Chess {
    private String name;
    private int px;
    private int py;

    public Chess(String name, int px, int py) {
        this.name = name;
        this.px = px;
        this.py = py;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public abstract void move(int x,int y);

    public void point(){
        System.out.println("X:"+px+"，Y:"+py);
    }
    public void eatChess(){

    }
    @Override
    public String toString() {
        return "Chess{" +
                "name='" + name + '\'' +
                ", px=" + px +
                ", py=" + py +
                '}';
    }
}
