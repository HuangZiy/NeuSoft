package com.neuedu.day_08;

public abstract class Role {
    private String nickName;
    private String name;
    private char gender;
    private int age;

    public Role(String nickName, String name, char gender, int age) {
        this.nickName = nickName;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //  子类中都应该有，但表现有差异的方法设为抽象方法
    public abstract void fight();
//  表现无差异的方法
    public void eat(){
        System.out.println(this.name+"每天三顿饭");
    }
//
    public void sleep(){
        System.out.println(this.name+"每天睡两遍");
    }
    public void output(){
        System.out.println("人物姓名："+name+"，绰号："+nickName+"，年龄："+age+"，性别："+gender);
    }
}
