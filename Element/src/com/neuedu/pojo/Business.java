package com.neuedu.pojo;

public class Business {
    private int bid;
    private int aid;
    private String bacc;
    private String pwd;
    private String bname;
    private String baddress;
    private String binfo;
    private double bsf;
    private double bdf;

    public Business(int aid, String bacc, String pwd, String bname) {
        this.aid = aid;
        this.bacc = bacc;
        this.pwd = pwd;
        this.bname = bname;
    }

    public Business(String bacc, String pwd, String bname, String baddress, String binfo, double bsf, double bdf) {
        this.bacc = bacc;
        this.pwd = pwd;
        this.bname = bname;
        this.baddress = baddress;
        this.binfo = binfo;
        this.bsf = bsf;
        this.bdf = bdf;
    }

    public Business(int bid, String bacc, String pwd, String bname, String baddress, String binfo, double bsf, double bdf) {
        this.bid = bid;
        this.bacc = bacc;
        this.pwd = pwd;
        this.bname = bname;
        this.baddress = baddress;
        this.binfo = binfo;
        this.bsf = bsf;
        this.bdf = bdf;
    }

    public Business(int bid, int aid, String bacc, String pwd, String bname, String baddress, String binfo, double bsf, double bdf) {
        this.bid = bid;
        this.aid = aid;
        this.bacc = bacc;
        this.pwd = pwd;
        this.bname = bname;
        this.baddress = baddress;
        this.binfo = binfo;
        this.bsf = bsf;
        this.bdf = bdf;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getBacc() {
        return bacc;
    }

    public void setBacc(String bacc) {
        this.bacc = bacc;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    public String getBinfo() {
        return binfo;
    }

    public void setBinfo(String binfo) {
        this.binfo = binfo;
    }

    public double getBsf() {
        return bsf;
    }

    public void setBsf(double bsf) {
        this.bsf = bsf;
    }

    public double getBdf() {
        return bdf;
    }

    public void setBdf(double bdf) {
        this.bdf = bdf;
    }

    @Override
    public String toString() {
        return "[" +
                "商家编号=" + bid +
                ", 商家名称='" + bname + '\'' +
                ", 商家地址='" + baddress + '\'' +
                ", 商家介绍='" + binfo + '\'' +
                ", 起送费=" + bsf +
                ", 配送费=" + bdf +
                ']';
    }
}
