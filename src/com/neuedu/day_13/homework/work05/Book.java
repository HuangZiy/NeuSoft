package com.neuedu.day_13.homework.work05;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private String author;
    private double price;

    public Book(int id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                "\t name='" + name + '\'' +
                "\t author='" + author + '\'' +
                "\t price=" + price +
                ']';
    }
}
