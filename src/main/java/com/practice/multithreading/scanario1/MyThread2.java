package com.practice.multithreading.scanario1;

public class MyThread2 implements Runnable {

    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+"\t"+" i ="+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}