package com.neuedu.pojo;

public class Admin {
    private int aid;
    private String aacc;
    private String apwd;
    private String aname;

    public Admin() {
    }

    public Admin(String aacc, String apwd, String aname) {
        this.aacc = aacc;
        this.apwd = apwd;
        this.aname = aname;
    }

    public Admin(int aid, String aacc, String apwd, String aname) {
        this.aid = aid;
        this.aacc = aacc;
        this.apwd = apwd;
        this.aname = aname;
    }

    public String getAacc() {
        return aacc;
    }

    public void setAacc(String aacc) {
        this.aacc = aacc;
    }

    public Admin(int aid, String apwd, String aname) {
        this.aid = aid;
        this.apwd = apwd;
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "[" +
                "aid=" + aid +
                ", apwd='" + apwd + '\'' +
                ", aname='" + aname + '\'' +
                ']';
    }
}
