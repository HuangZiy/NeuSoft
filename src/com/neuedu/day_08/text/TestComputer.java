package com.neuedu.day_08.text;

public class TestComputer {
    public static void main(String[] args) {
        Usb m = new Mouse();
        Usb c = new Camera();
        Usb f = new Fan();
        Computer computer = new Computer();
//        computer.setUsbf(f);
//        computer.setUsbc(c);
//        computer.setUsbm(m);
        computer.work();
    }
}
