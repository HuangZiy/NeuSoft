package com.neuedu.day_11.homework;

public class work2_05 {



        public static void main(String[] args)

        {

            StringBuffer a=new StringBuffer("A");

            StringBuffer b=new StringBuffer("B");

            mb_operate(a,b);

            System.out.println(a+"."+b);

        }//方法main结束
        static void mb_operate(StringBuffer x,StringBuffer y)

        {

            x.append(y);

            y=new StringBuffer("AB");

        }//方法mb_operate结束

    //类J_StringBuffer结束
}
//AB B