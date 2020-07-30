package com.neuedu.day_08.day_08_homework_12;

public class TestShape {
    public static void compute(Shape e){
        System.out.println(e.getArea()+","+e.getLength());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,4);
        Circle c = new Circle(4);
        compute(r);
        compute(c);
        Cone cone =new Cone(c,3);
        System.out.println(cone.getArea());
    }
}
