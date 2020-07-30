package com.neuedu.day_09.modifier;

public class Father {
    private double gold=100;
    public String cloth="普通衣服";
    protected String ston = "祖传玉石";
    String chair = "椅子";

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getSton() {
        return ston;
    }

    public void setSton(String ston) {
        this.ston = ston;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }
}
