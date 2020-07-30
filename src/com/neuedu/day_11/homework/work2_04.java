package com.neuedu.day_11.homework;

public class work2_04 {

        String m_string=new String("good");

        String m_array[]={"aaa"};

        public void mb_method(String s, String[]sa)

        {

            s="bad";

            sa[0]="bbb";

        }

        public static void main(String args[])

        {

            work2_04 a=new work2_04();

            a.mb_method(a.m_string,a.m_array);

            System.out.println(a.m_string + a.m_array[0]);

        }


}
