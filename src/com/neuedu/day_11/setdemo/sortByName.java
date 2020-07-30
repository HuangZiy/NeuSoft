package com.neuedu.day_11.setdemo;

import java.io.UnsupportedEncodingException;
import java.text.Collator;
import java.util.Comparator;

public class sortByName implements Comparator<SeleMan> {
    @Override
    public int compare(SeleMan o1, SeleMan o2) {
        Collator collator= Collator.getInstance(java.util.Locale.CHINA);
        String name1 = o1.getName();
        String name2 = o2.getName();
        int compare_value=collator.compare(name1,name2);
        if(compare_value>0){
            return -1;
        }
        if(compare_value<0){
            return  1;
        }
        return 0;
    }
}
