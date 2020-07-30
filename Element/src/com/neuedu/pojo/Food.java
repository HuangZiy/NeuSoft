package com.neuedu.pojo;

public class Food {
    private int fid;
    private int bid;
    private String fname;
    private String finfo;
    private double fprice;

    public Food() {
    }

    public Food(int fid, String fname, String finfo, double fprice) {
        this.fid = fid;
        this.fname = fname;
        this.finfo = finfo;
        this.fprice = fprice;
    }

    public Food(String fname, String finfo, double fprice) {
        this.fname = fname;
        this.finfo = finfo;
        this.fprice = fprice;
    }

    public Food(int fid, int bid, String fname, String finfo, double fprice) {
        this.fid = fid;
        this.bid = bid;
        this.fname = fname;
        this.finfo = finfo;
        this.fprice = fprice;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFinfo() {
        return finfo;
    }

    public void setFinfo(String finfo) {
        this.finfo = finfo;
    }

    public double getFprice() {
        return fprice;
    }

    public void setFprice(double fprice) {
        this.fprice = fprice;
    }

    @Override
    public String toString() {
        return "Food{" +
                "fid=" + fid +
                ", bid=" + bid +
                ", fname='" + fname + '\'' +
                ", finfo='" + finfo + '\'' +
                ", fprice=" + fprice +
                '}';
    }
}
