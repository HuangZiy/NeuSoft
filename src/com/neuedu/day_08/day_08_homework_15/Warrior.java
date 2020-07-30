package com.neuedu.day_08.day_08_homework_15;

public class Warrior implements Fightable {
    private int experience;
    private int blood;

    public Warrior(int experience, int blood) {
        this.experience = experience;
        this.blood = blood;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    @Override
    public void win() {
        experience+=100;
    }

    @Override
    public int injure(int x) {
        blood-=x;
        return blood;
    }

    public void danger(){
        if (blood<MAX){
            System.out.println("危险！！！！");
        }
    }
}
