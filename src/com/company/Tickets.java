package com.company;

public class Tickets extends  Thread{
    private int tickets =100;
    Object obj = new Object();

    public void run(){

        while(true){
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}
