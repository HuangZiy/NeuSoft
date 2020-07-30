package com.neuedu.day_08.day_08_homework_16;

public class Pro implements OneToN {
    @Override
    public int dispose(int n) {
        int sum=1;
        for (int i = 2; i <n ; i++) {
            sum*=i;
        }
        return sum;
    }
}
