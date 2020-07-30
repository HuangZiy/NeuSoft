package com.neuedu.day_13.homework.work04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    List<Commodity> list =new ArrayList<>();
    public void add(Commodity c){
        list.add(c);
    }
    public void showAll(){
        Iterator it = list.iterator();
        while (it.hasNext()){
            Commodity c = (Commodity) it.next();
            System.out.println(c);
        }
    }
    public double sum(){
        double sum = 0;
        Iterator it = list.iterator();
        while (it.hasNext()){
            Commodity c = (Commodity) it.next();
            sum+=c.getPrice()*c.getNumber();
        }
        return sum;
    }
}
