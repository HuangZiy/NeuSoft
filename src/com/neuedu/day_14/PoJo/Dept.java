package com.neuedu.day_14.PoJo;

public class Dept {
    private int deptno;
    private String dname;
    private String loc;

    public Dept(int dept, String dname, String loc) {
        this.deptno = dept;
        this.dname = dname;
        this.loc = loc;
    }

    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dept=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
