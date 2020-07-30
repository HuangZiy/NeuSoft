package com.neuedu.day_12.homework;


public class Company<T> {
    public double money(T e,int days){
        if (e instanceof LittleCar){
            return ((LittleCar) e).getPrice()*days;
        }
        if (e instanceof Bus){
            return ((Bus) e).getPrice()*days;
        }
        return -1;
    }
}
