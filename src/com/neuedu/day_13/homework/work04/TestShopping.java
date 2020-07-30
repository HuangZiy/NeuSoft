package com.neuedu.day_13.homework.work04;

public class TestShopping {
    public static void main(String[] args) {
        Commodity c1 = new Commodity("可乐",3,100);
        Commodity c2 = new Commodity("绿茶",4.5,200);
        Commodity c3 = new Commodity("冰淇淋",4,50);

        ShoppingCart sp = new ShoppingCart();
        sp.add(c1);
        sp.add(c2);
        sp.add(c3);

        sp.showAll();

        double sum = sp.sum();
        System.out.println(sum);
    }

}
