package com.company;

public class Teacher implements Runnable{
    int age;
    public Teacher(int age){
        this.age=age;
    }
    public void run(){
        for(int i=0;i<7;i++){
            System.out.println(this.age+"  "+Thread.currentThread().getName());
        }
    }
}
