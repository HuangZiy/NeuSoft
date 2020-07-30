package com.neuedu.day_08;

public class Park {
    public void draw(Viechle viechle,int hour){
        double total = viechle.fee()*hour;
        System.out.println(viechle.getType()+"停留"+hour+"小时，应缴纳费用"+total+"元");
    }
}
