package com.company;

public class ThreadTest {
    public static void main(String[] args) {
        Person p1 = new Person("小明");
        Person p2 = new Person("小红");
        p1.start();
        p2.run();
    }
}
