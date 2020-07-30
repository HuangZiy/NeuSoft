package com.neuedu.day_08.day_08_homework_17;

public class Print implements InterfaceA, InterfaceB {
    @Override
    public void printCapitalLetter() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i);
        }
    }

    @Override
    public void printLowercaseLetter() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }
    }
}
