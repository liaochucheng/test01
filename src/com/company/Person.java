package com.company;

public class Person extends Thread{
    String name;
    public Person(String name){
        this.name=name;
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(this.name+i+"/t"+Thread.currentThread()+"/t"+getName());
        }
    }
}
