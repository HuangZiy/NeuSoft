package com.neuedu.day_08;

public class Thief extends Role {

    public Thief(String nickName, String name, char gender, int age) {
        super(nickName, name, gender, age);
    }

    @Override
    public void fight() {
        System.out.println(this.getName()+"用小刀去行刺");
    }
    public void steal(){
        System.out.println(this.getName()+"是一个百变神偷");
    }
    public void collectInfo(){
        System.out.println(this.getName()+"善于收集情报");
    }
}
