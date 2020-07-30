package com.neuedu.day_08.day_08_homework_16;

public class Sum implements OneToN {
    @Override
    public int dispose(int n) {
        int sum=0;
        for (int i = 1; i <n ; i++) {
            sum+=i;
        }
        return sum;
    }
}
