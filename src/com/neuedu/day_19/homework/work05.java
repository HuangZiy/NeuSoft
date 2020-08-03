package com.neuedu.day_19.homework;


class Foo {
    private int x;

    public Foo(int x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

public class work05 {
    static Foo fooBar(Foo foo) {
        foo = new Foo(100);
        return foo;
    }

    public static void main(String[] args) {
        Foo foo = new Foo(300);
        System.out.print(foo.getX() + "-");//300-
        Foo fooFoo = fooBar(foo);
        System.out.print(foo.getX() + "-");//300-
        System.out.print(fooFoo.getX() + "-");//100-
        foo = fooBar(fooFoo);
        System.out.print(foo.getX() + "-");//100-
        System.out.print(fooFoo.getX());//100-
    }
}

