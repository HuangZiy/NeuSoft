package com.neuedu.day_08.day_08_homework_13;

public class Perfect extends Number {
    @Override
    void method() {
        for (int i = 2; i <=1000 ; i++) {
            int num=0;
            for (int j = 1; j <i ; j++) {
                if (i%j==0){
                    num+=j;
                }
            }
            if (num==i){
                System.out.println(i);
            }
        }
    }
}
