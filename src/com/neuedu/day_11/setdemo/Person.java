package com.neuedu.day_11.setdemo;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    String name;
    int age;
    public void show(){
        System.out.print("name = " + name);
        System.out.print(",age = " + age+"\t");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Person p) {
//        if (this.age>p.age){
//            return 1;
//        }else if (this.age<p.age){
//            return -1;
//        }else{
//            return 0;
//        }
//    }

    @Override
    public int compare(Person o1, Person o2) {
        if (this.age>o1.age){
            return 1;
        }else if (this.age<o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}
