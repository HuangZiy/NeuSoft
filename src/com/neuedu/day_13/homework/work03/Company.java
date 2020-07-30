package com.neuedu.day_13.homework.work03;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Emp> list=new ArrayList<>();

    public void add(Emp e){
        list.add(e);
    }

    public Emp lottery(){
        int max=list.size();
        int random =(int)(Math.random()*max);
        return list.get(random);
    }
}
