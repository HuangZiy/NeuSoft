package com.neuedu.day_08.day_08_homework_15;

public class BloodWarrior extends Warrior {
    public BloodWarrior(int experience, int blood) {
        super(experience, blood);
    }

    public void danger(){
        if (getBlood()<MAX/2){
            System.out.println("危险！！！！");
        }
    }
}
