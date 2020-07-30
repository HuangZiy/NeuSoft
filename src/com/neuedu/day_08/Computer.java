package com.neuedu.day_08;

public class Computer {
    private int cpu;
    private int menmory;
    private int harddisk;

    public Computer(int cpu, int menmory, int harddisk) {
        this.cpu = cpu;
        this.menmory = menmory;
        this.harddisk = harddisk;
    }

    public Computer(Object o) {
    }

    public void showInfo(){
        System.out.println("CPU主频:"+cpu+"Hz,内存容量:"+menmory+"GB,硬盘容量:"+harddisk+"GB");
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMenmory() {
        return menmory;
    }

    public void setMenmory(int menmory) {
        this.menmory = menmory;
    }

    public int getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(int harddisk) {
        this.harddisk = harddisk;
    }


}
