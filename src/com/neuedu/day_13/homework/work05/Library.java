package com.neuedu.day_13.homework.work05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Library {
    Set<Book> set =new HashSet<>();

    public void add(Book b){
        if (set.add(b)){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败！请不要添加重复的图书！");
        }
    }

    public void show(){
        Iterator it = set.iterator();
        while (it.hasNext()){
            Book b = (Book) it.next();
            System.out.println(b);
        }
    }


}
