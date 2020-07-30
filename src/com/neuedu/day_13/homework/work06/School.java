package com.neuedu.day_13.homework.work06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class School {
    private Map<Teacher,Course> map =new HashMap<>();

    public void add(Teacher t,Course c){
        map.put(t,c);
    }

    public void change(Teacher t,Course c){
        map.put(t,c);
    }

    public void show(){
        Set<Map.Entry<Teacher,Course>> set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Teacher,Course> en = (Map.Entry<Teacher, Course>) it.next();
            Teacher teacher = en.getKey();
            Course course = en.getValue();
            System.out.println("老师为："+teacher+"，课程为："+course);
        }
    }

    public void find(Course c){
        Set<Map.Entry<Teacher,Course>> set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Teacher,Course> en = (Map.Entry<Teacher, Course>) it.next();
            Teacher teacher = en.getKey();
            Course course = en.getValue();
            String cname = course.getName();
            String cname1 = c.getName();
            if (cname.equalsIgnoreCase(cname1)){
                System.out.println("老师为："+teacher+"，课程为："+course);
            }
        }
    }
}
