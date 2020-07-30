package com.neuedu.day_13.homework.work06;

public class TestSchool {
    public static void main(String[] args) {
        School school = new School();
        Teacher t1 = new Teacher("Allen");
        Teacher t2 = new Teacher("Lucy");
        Teacher t3 = new Teacher("Mike");
        Course c1 = new Course("JDBC");
        Course c2 = new Course("ASP");
        Course c3 = new Course("JSP");
        Course c4 = new Course("CoreJava");
        school.add(t1,c1);
        school.add(t2,c2);
        school.add(t3,c3);
        school.show();
        System.out.println();
        school.change(t2,c4);
        school.show();
        System.out.println("找到教jsp");
        school.find(c3);
    }
}
