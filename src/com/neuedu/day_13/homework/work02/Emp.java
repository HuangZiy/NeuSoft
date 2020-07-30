package com.neuedu.day_13.homework.work02;


public class Emp {
    private int pno;
    private String name;
    private double sal;

    public Emp(int pno, String name, double sal) {
        this.pno = pno;
        this.name = name;
        this.sal = sal;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "[" +
                "pno=" + pno +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ']';
    }
}
