package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.scanario1.MyThread1;

public class DaemonMain {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+" started ");

        MyThread1 myThread1= new MyThread1();
        myThread1.setDaemon(true);
        myThread1.start();
        System.out.println(Thread.currentThread().getName()+" ended ");
        /*
        main started
        main ended
         */
    }
}
