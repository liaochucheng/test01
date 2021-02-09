package com.company;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(21);
        Teacher t2 = new Teacher(23);
        Thread t = new Thread(t1);
        t.start();
        t2.run();
    }

}
