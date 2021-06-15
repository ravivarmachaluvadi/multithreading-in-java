package com.practice.multithreading;

public class MyThread extends Thread {

    public void run(){
        for (int i = 0; i < 11; i++) {
            System.out.println(" current thread" + Thread.currentThread().getName()+"\t"+" i ="+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
