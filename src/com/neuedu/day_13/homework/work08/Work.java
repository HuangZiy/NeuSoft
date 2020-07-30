package com.neuedu.day_13.homework.work08;

import java.util.*;

public class Work {
    private List<Integer> list = new ArrayList<>();
    private Map<Integer,Integer> map = new HashMap<>();

    public void init(){
        int n = 100;
        int m = 20;
        boolean flag = true;
        for (int i=0;i<n;i++){
            int random = (int)(Math.random()*m);
            list.add(random);
            if (map.get(random)!=null){
                int value = map.get(random);
                value++;
                map.put(random,value);
                if (flag){
                    System.out.println("第一次重复的数字是："+random);
                    flag=false;
                }
            }else {
                int value = 1;
                map.put(random,value);
            }
        }
    }

    public void nums(){
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,Integer> en = (Map.Entry<Integer, Integer>) it.next();
            int key = en.getKey();
            int value = en.getValue();
            System.out.println("数值为："+key+"，次数："+value);
        }
    }

    public void maxRepeat(){
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        Iterator it = set.iterator();
        Iterator it2 = set.iterator();
        int maxValue=0;
        int maxKey=0;
        while (it.hasNext()){
            Map.Entry<Integer,Integer> en = (Map.Entry<Integer, Integer>) it.next();
            int key = en.getKey();
            int value = en.getValue();
            if(value>maxValue){
                maxValue=value;
            }
        }
        while (it2.hasNext()){
            Map.Entry<Integer,Integer> en = (Map.Entry<Integer, Integer>) it2.next();
            int key = en.getKey();
            int value = en.getValue();
            if(value==maxValue){
                System.out.println("数值为："+key+"，次数："+value);
            }
        }
    }
}
