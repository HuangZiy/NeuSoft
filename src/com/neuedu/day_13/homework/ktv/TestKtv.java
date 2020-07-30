package com.neuedu.day_13.homework.ktv;

import java.util.LinkedList;
import java.util.List;

public class TestKtv {
    public static void main(String[] args) {
        Music m1 = new Music("青花瓷","周杰伦");
        Music m2 = new Music("千里之外","周杰伦");
        Music m3 = new Music("园游会","周杰伦");
        Music m4 = new Music("爱在西元前","周杰伦");

        List<Music> list = new LinkedList<>();
        Ktv ktv = new Ktv(list);
        ktv.add(m1);
        ktv.add(m2);
        ktv.add(m3);
        ktv.add(m4);
        ktv.showAll();
        System.out.println(m2.getName()+"，删除后：");
        ktv.remove(m2);
        ktv.showAll();
        System.out.println(m3.getName()+"，置顶歌曲：");
        ktv.fristMusic(m3);
        ktv.showAll();
        System.out.println(m4.getName()+"，将歌曲前置一位：");
        ktv.addOneMusic(m4);
        ktv.showAll();
    }

}
