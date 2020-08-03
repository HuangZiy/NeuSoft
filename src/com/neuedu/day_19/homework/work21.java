package com.neuedu.day_19.homework;

public class work21 {
    static class Batman {

        int squares = 81;


        void go() {

            incr(++squares);

            System.out.println(squares);

        }

        void incr(int squares) {

            squares += 10;

        }


    }

    static class TestBatman {

        public static void main(String[] args) {

            new Batman().go();

        }

    }
}
