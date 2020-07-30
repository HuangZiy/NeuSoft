package com.neuedu.day_08.day_08_homework_13;

public class Prime extends Number {

    @Override
    void method() {
        for (int i = 3; i <=100 ; i++) {
            int num=0;
            int j = 0;
            boolean flag = true;
            for (j = 2; j < i ; j++) {
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}
