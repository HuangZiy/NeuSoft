package com.neuedu.day_11.setdemo;

import java.util.Comparator;

public class scoreSort implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        int sc1 =s1.getScore();
        int sc2 =s2.getScore();
        if (sc1>sc2){
            return 1;
        }else if(sc1<sc2){
            return -1;
        }else {
            return 0;
        }
    }
}
