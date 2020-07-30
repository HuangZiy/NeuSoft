package com.neuedu.day_11.setdemo;

import java.util.*;

public class School {
    List<Student> slist = new ArrayList<>();

    public void add(Student s){
        slist.add(s);
    }

    public void browse(){
        Iterator<Student> its = slist.iterator();
        while (its.hasNext()){
            Student s = its.next();
            System.out.println(s.getName()+","+s.getScore());
        }
    }

    public int getSNum(){
        return slist.size();
    }

    public int getScNum(){
        int sum=0;
        Iterator<Student> its = slist.iterator();
        while (its.hasNext()) {
            Student s = its.next();
            sum+=s.getScore();
        }
        return sum;
    }

    public int getAvgSc(){
        return getScNum()/getSNum();
    }

    private boolean remove(Student s){
        return slist.remove(s);
    }

    private boolean find(Student s){
        return slist.contains(s);
    }

    public void showRemove(Student s){
        System.out.println(remove(s)?"开除成功！":"开除失败!");
    }

    public void showFind(Student s){
        System.out.println(find(s)?"找到了！":"没有找到!");
    }

    public void sortscore(){
        System.out.print("原来的成绩为：");
        browse();
//        slist.sort(                                    new scoreSort());
        Comparator byScore = new scoreSort();
        Collections.sort(slist,byScore);
        System.out.print("排序后成绩为：");
        browse();
    }
}
