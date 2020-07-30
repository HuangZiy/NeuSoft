package com.neuedu.day_13.hashsetdemo01;

import java.io.UnsupportedEncodingException;
import java.util.Objects;

public class Person implements Comparable {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(name, person.name);
//    }
    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        if (o instanceof Person) {
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(Object o) {
        try {
            Person p = (Person)o;
            String name1 =this.name.getBytes("GBK").toString();
            String name2 =p.getName().getBytes("GBK").toString();
            return name1.compareTo(name2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
