package com.neuedu.day_13.mapdemo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(10,"Neusoft");
        map.put(30,"ASUS");
        map.put(20,"HP");
        map.put(5,"Microsoft");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entry =it.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+","+value);
        }
//        Person p1 = new Person("啊王");
//        Person p2 = new Person("吧王");
//        Person p3 = new Person("老王");
//        Person p4 = new Person("小小王");
//
//        map.put("1",p1);
//        map.put("2",p2);
//        map.put("3",p3);
//        map.put("4",p4);

//        Person v1=map.get("1");
//        System.out.println("V1="+v1.getName()+"，对应的键是20");
//        Set<Integer> keys = map.keySet();
//        System.out.println(keys);
//        Iterator<Integer> it = keys.iterator();
//        while (it.hasNext()){
//            String res=map.get(it.next());
//            System.out.println(res);
//        }
//        System.out.println(map.containsKey(20)?"存在":"不存在");
//        System.out.println(map.containsValue("HP")?"存在":"不存在");
    }

}
