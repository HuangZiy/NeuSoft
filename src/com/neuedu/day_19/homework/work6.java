package com.neuedu.day_19.homework;

interface work6 {
}

class Alpha implements work6 {
}

class Beta extends Alpha {
}

class Delta extends Beta {
    public static void main(String[] args) {
        Beta x = new Beta();
        Alpha a = x;
    }

}
