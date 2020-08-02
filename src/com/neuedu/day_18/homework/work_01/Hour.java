package com.neuedu.day_18.homework.work_01;

import java.util.Calendar;

public class Hour extends Person {
    private int hour;
    private double hourMoney;

    public Hour(String name, int month, double sal, int hour, double hourMoney) {
        super(name, month, sal);
        this.hour = hour;
        this.hourMoney = hourMoney;
    }

    @Override
    public double sal() {
        if (month == Calendar.MONTH) {
            sal += 100;
        }
        if (hour > 160) {
            sal += (hour - 160) * hourMoney * 1.5;
            sal += 160 * hourMoney;
        } else {
            sal += hour * hourMoney;
        }
        return sal;
    }
}
