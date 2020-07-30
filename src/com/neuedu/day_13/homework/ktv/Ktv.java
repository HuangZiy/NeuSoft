package com.neuedu.day_13.homework.ktv;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ktv {
    List<Music> list=new LinkedList<>();

    public Ktv(List<Music> list) {
        this.list = list;
    }

    public void add(Music m){
        list.add(m);
    }

    public void showAll(){
        Iterator it = list.iterator();
        while (it.hasNext()){
            Music m = (Music) it.next();
            String name = m.getName();
            String singer = m.getSinger();
            System.out.println("歌手："+singer+"，歌名："+name);
        }
    }

    public void remove(Music m){
        list.remove(m);
    }

    public void fristMusic(Music m){
        if (list.contains(m)){
            Music m1 = m;
            list.remove(m);
            list.add(0,m1);
        }else {
            list.add(0,m);
        }
    }

    public void addOneMusic(Music m){
        if (list.contains(m)){
            Music m1 = m;
            int index = list.indexOf(m);
            if (index!=0){
                list.remove(m);
                list.add(index-1,m1);
            }else {
                System.out.println("该歌曲已在第一位");
            }

        }else {
            System.out.println("该歌曲在歌单中不存在");
        }
    }

}
