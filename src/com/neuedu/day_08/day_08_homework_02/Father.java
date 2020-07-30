package com.neuedu.day_08.day_08_homework_02;

public class Father {
    private int f_age;
    public String f_name;

    public Father(int f_age, String f_name) {
        this.f_age = f_age;
        this.f_name = f_name;
    }

    public Father() {
    }

    public int getF_age() {
        return f_age;
    }

    public void setF_age(int f_age) {
        this.f_age = f_age;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void work(){
        System.out.println(this.f_name+"正在工作~");
    }
    public void drive(){
        System.out.println(this.f_name+"正在开车~");
    }
}
