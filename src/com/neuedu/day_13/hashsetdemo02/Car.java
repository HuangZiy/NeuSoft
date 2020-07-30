package com.neuedu.day_13.hashsetdemo02;

import java.util.Objects;

public class Car implements Comparable {
    private String brond;
    private String idCar;

    public String getBrond() {
        return brond;
    }

    public void setBrond(String brond) {
        this.brond = brond;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public Car(String brond, String idCar) {
        this.brond = brond;
        this.idCar = idCar;
    }


    public boolean equalss(Object o){
        if (o instanceof Car){
            Car c=(Car)o;
            return this.idCar.equalsIgnoreCase(c.getIdCar());
        }
        return false;
    }


    public int hashCodes(){
        return Objects.hash(idCar);
    }

    public void show(){
        System.out.println("品牌："+brond+"，车牌："+idCar);
    }

    @Override
    public int compareTo(Object o) {
        Car cd = (Car)o;
        return this.idCar.compareTo(cd.idCar);
    }
}
