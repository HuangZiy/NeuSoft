package com.neuedu.day_08;

public abstract class Viechle {
    private String type;

    public Viechle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract double fee();
}
