package com.neuedu.day_08.day_08_homework_19;

public class Union implements Student {

    @Override
    public void getStudentNames() {
        for (String s:names) {
            System.out.println(s);
        }
    }
}
