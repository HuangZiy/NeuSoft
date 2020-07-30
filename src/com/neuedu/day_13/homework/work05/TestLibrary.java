package com.neuedu.day_13.homework.work05;

public class TestLibrary {
    public static void main(String[] args) {
        Book b1 = new Book(1001,"挪威的森林","村上春树",50);
        Book b2 = new Book(1002,"三体","刘慈欣",100);
        Book b3 = new Book(1003,"面向对象程序设计","刘浩强",60);
        Book b4 = new Book(1001,"挪威的森林","村上春树",50);

        Library library = new Library();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        library.show();
    }

}
