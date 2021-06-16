package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.scanario1.MyThread1;

public class NonDaemonMain {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+" started ");

        MyThread1 myThread1= new MyThread1();
        myThread1.start();
        System.out.println(Thread.currentThread().getName()+" ended ");

        /*
main started
main ended
Thread-0	 i =0
Thread-0	 i =1
Thread-0	 i =2
Thread-0	 i =3
Thread-0	 i =4
Thread-0	 i =5
         */
    }
}

