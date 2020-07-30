package com.neuedu.day_11.setdemo;

import java.util.Comparator;

public class sortByDegree implements Comparator<SeleMan> {

    @Override
    public int compare(SeleMan o1, SeleMan o2) {
        int degree1 = o1.getSelesDegree();
        int degree2 = o2.getSelesDegree();
        if (degree1>degree2){
            return -1;
        }else if (degree1<degree2){
            return 1;
        }else {
            return 0;
        }
    }
}
