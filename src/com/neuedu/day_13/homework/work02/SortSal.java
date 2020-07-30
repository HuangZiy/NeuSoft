package com.neuedu.day_13.homework.work02;

import java.util.Comparator;

public class SortSal implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Emp && o2 instanceof Emp){
            Emp e1= (Emp)o1;
            Emp e2= (Emp)o2;
            if (e1.getSal()>e2.getSal()){
                return 1;
            }else if (e1.getSal()<e2.getSal()){
                return -1;
            }else {
                return 0;
            }
        }
        return -1;
    }
}
