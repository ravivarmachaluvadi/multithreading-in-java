package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.MyThread;

public class Main {

    public static void main(String[] args) {

        MyThread t1= new MyThread();
        MyThread t2= new MyThread();
        t1.start();
        t2.start();

    }
}
