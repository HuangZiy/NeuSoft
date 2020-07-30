package com.neuedu.linklistdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void put(T o){
        linkedList.push(o);
    }

    public T get(){
       return linkedList.pollLast();
    }

    public boolean isEmpty(){
       return linkedList.isEmpty();
    }

    public int size(){
       return linkedList.size();
    }

    public void showAll(){
        Iterator<T> its = linkedList.iterator();
        while (its.hasNext()){
            System.out.print(its.next()+" ");
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                linkedList +
                '}';
    }
}
