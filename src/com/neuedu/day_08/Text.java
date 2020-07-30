package com.neuedu.day_08;

public class Text {
    public static void main(String[] args) {
//        ATM atm = new ATM(100000,5,16,512);
//        atm.showInfo();
//        atm.draw(5000);

//        Rectangle rectangle = new Rectangle(12,16,"red");
//        rectangle.display();

        Thief t = new Thief("鼓上蚤","时迁",'男',40);
        General g = new General("霹雳火","秦明",'男',50);
//        t.collectInfo();
//        t.steal();
//        t.fight();
//        t.output();
//        g.admin();
//        g.strategy();
//        g.fight();
//        g.output();
//        t.eat();
//        t.sleep();
//        g.eat();
//        g.sleep();
//        Role r = new Thief("鼓上蚤","时迁",'男',40);
//        r.fight();
//        r.output();
//        if (r instanceof Thief){
////            ((Thief) r).steal();
//
//        }
//        r=new General("霹雳火","秦明",'男',50);
//        r.fight();
//        r.output();
        Park p = new Park();
        Viechle v = new Truck("卡车");
        p.draw(v,2);
        v=new Bus("中巴");
        p.draw(v,2);
        v=new Car("私家车");
        p.draw(v,2);
    }

}
