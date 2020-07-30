package com.neuedu.day_14.PoJo;

import java.sql.Date;

public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private double sal;
    private double comm;
    private Date date;
    private int deptno;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }



    public Emp(int empno, String ename, String job, int mgr, double sal, double comm, Date date, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.sal = sal;
        this.comm = comm;
        this.date = date;
        this.deptno = deptno;
    }

    public Emp(int empno, String ename, String job, int mgr, double sal, double comm, Date date) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.sal = sal;
        this.comm = comm;
        this.date = date;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "[" +
                "员工编号=" + empno +
                ", 员工姓名='" + ename + '\'' +
                ", 职位='" + job + '\'' +
                ", 经理=" + mgr +
                ", 工资=" + sal +
                ", 奖金=" + comm +
                ", 日期=" + date +
                ", 部门编号=" + deptno +
                ']';
    }
}
