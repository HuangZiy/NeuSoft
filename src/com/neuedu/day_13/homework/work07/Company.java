package com.neuedu.day_13.homework.work07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Company {
    private Map<String,Emp> map = new HashMap<>();
    public void add(String id,Emp e){
        map.put(id,e);
    }
    public int numOfPeople(){
        return map.size();
    }
    public void showAll(){
        Set<Map.Entry<String,Emp>> set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String,Emp> en = (Map.Entry<String, Emp>) it.next();
            String id = en.getKey();
            Emp e = en.getValue();
            System.out.println("员工编号为："+id+"，员工信息为："+e);
        }
    }
    public void find(String id) {
        Set<Map.Entry<String, Emp>> set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Emp> en = (Map.Entry<String, Emp>) it.next();
            String id1 = en.getKey();
            Emp e = en.getValue();
            if (id.equalsIgnoreCase(id1)) {
                System.out.println("员工编号为：" + id + "，员工信息为：" + e);
            }
        }
    }
    public double avgSal(){
        Set<Map.Entry<String, Emp>> set = map.entrySet();
        Iterator it = set.iterator();
        double sum=0;
        while (it.hasNext()) {
            Map.Entry<String, Emp> en = (Map.Entry<String, Emp>) it.next();
            Emp e = en.getValue();
            sum+=e.getSal();
        }
        return sum/numOfPeople();
    }
}
