package com.neuedu.day_08.day_08_homework_09;

public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
    public void show(){
        System.out.println(wheels+","+weight);
    }
}
