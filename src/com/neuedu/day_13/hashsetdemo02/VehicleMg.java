package com.neuedu.day_13.hashsetdemo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VehicleMg {
    Set<Car> sc = new HashSet<>();

    public VehicleMg(Set<Car> sc) {
        this.sc = sc;
    }

    public boolean registered(Car c){
        Iterator<Car> itc = sc.iterator();
        while (itc.hasNext()){
            Car cc = itc.next();
            if (cc.hashCodes()==c.hashCodes()&&cc.equalss(c)){
                return false;
            }
        }
        sc.add(c);
        return true;
    }

    public boolean Logout(Car c){
        Iterator<Car> itc = sc.iterator();
        while (itc.hasNext()){
            Car cc = itc.next();
            if (cc.hashCodes()==c.hashCodes()&&cc.equalss(c)){
                sc.remove(c);
                return true;
            }
        }
        return false;
    }

    public Car find(Car c){
        Iterator<Car> itc = sc.iterator();
        while (itc.hasNext()){
            Car cc = itc.next();
            if (cc.hashCodes()!=c.hashCodes()){
                return null;
            }else if (!cc.equalss(c)){
                return null;
            }else {
                return cc;
            }
        }
        return null;
    }

    public int numCar(){
        return sc.size();
    }

    public void showCar(){
        Iterator<Car> itc = sc.iterator();
        while (itc.hasNext()) {
            Car cc = itc.next();
            cc.show();
        }
    }
}
