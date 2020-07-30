package com.neuedu.day_08.day_08_homework_02;

public class Son extends Father {
    protected int s_age;
    protected String s_name;

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Son(int s_age, String s_name) {
        this.s_age = s_age;
        this.s_name = s_name;
    }

    private void play(){
        System.out.println(this.s_name+"正在玩~");
    }
    public void study(){
        System.out.println(this.s_name+"正在学习~");
    }
}
