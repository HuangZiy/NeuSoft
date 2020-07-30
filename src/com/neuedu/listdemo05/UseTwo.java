package com.neuedu.listdemo05;

public class UseTwo<X,Y> {
    private X x;
    private Y y;

    public UseTwo(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public void test(){
        System.out.println(x.toString()+","+y.toString());
    }
}
