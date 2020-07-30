package com.neuedu.day_08.day_08_homework_09;



public class Car extends Vehicle {
    private int loader;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                '}';
    }
    public void show(){
        super.show();
        System.out.println(loader);
    }
}
