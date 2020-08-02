package com.neuedu.day_18.homework.work_01;

import java.util.Calendar;

public class SeleMan extends Person {
    private int xse;
    private double xsl;

    public SeleMan(String name, int month, double sal, int xse, double xsl) {
        super(name, month, sal);
        this.xse = xse;
        this.xsl = xsl;
    }

    @Override
    public double sal() {
        if (month == Calendar.MONTH) {
            sal += 100;
        }
        sal += xse * xsl;
        return sal;
    }

}
