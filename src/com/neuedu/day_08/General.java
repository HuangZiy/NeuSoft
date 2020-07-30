package com.neuedu.day_08;

public class General extends Role {
    public General(String nickName, String name, char gender, int age) {
        super(nickName, name, gender, age);
    }

    @Override
    public void fight() {
        System.out.println(this.getName()+"骑马去战斗");
    }
    public void admin(){
        System.out.println(this.getName()+"需要号令严明，严格管理军队");
    }
    public void strategy(){
        System.out.println(this.getName()+"运筹帷幄之中，决胜千里之外");
    }
}
