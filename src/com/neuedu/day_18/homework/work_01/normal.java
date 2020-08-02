package com.neuedu.day_18.homework.work_01;

import java.util.Calendar;

public class normal extends Person {
    public normal(String name, int month, double sal) {
        super(name, month, sal);
    }

    @Override
    public double sal() {
        if (month == Calendar.MONTH) {
            sal += 100;
        }
        return sal;
    }
}
