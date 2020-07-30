package com.neuedu.day_11.setdemo;

public class SeleMan {
    private String name;
    private int selesDegree;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSelesDegree() {
        return selesDegree;
    }

    public void setSelesDegree(int selesDegree) {
        this.selesDegree = selesDegree;
    }

    public SeleMan(String name, int selesDegree) {
        this.name = name;
        this.selesDegree = selesDegree;
    }
    @Override
    public String toString() {
        return "SeleMan{" +
                "name='" + name + '\'' +
                ", selesDegree=" + selesDegree +
                '}';
    }
}
