package com.neuedu.listdemo05;

import java.util.ArrayList;
import java.util.List;

public class Rental<T> {
    private List<T> rlist = new ArrayList<>();

    public T rent(){
        return rlist.remove(0);
    }

    public void sendBack(T t){
        rlist.add(t);
    }


}
