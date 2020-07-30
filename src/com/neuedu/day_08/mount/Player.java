package com.neuedu.day_08.mount;

public abstract class Player {
    private String job;
    private String name;
    //把接口设计到Player类里，充当一个属性
    private Mount mount;

    public void move(){
        if (mount!=null){
            mount.mount();
        }else {
            System.out.println("日行万里");
        }

    }

    public abstract void fight();

    public Player(String job, String name) {
        this.job = job;
        this.name = name;
    }

    public Player(String job, String name, Mount mount) {
        this.job = job;
        this.name = name;
        this.mount = mount;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mount getMount() {
        return mount;
    }

    public void setMount(Mount mount) {
        this.mount = mount;
    }
}
