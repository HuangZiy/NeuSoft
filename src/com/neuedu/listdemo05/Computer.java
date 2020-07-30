package com.neuedu.listdemo05;

public class Computer {
    private String brand;
    private int CPU;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public Computer(String brand, int CPU) {
        this.brand = brand;
        this.CPU = CPU;
    }
}
