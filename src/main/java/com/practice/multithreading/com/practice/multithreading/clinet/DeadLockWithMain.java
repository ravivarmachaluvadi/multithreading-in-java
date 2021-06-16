package com.practice.multithreading.com.practice.multithreading.clinet;

public class DeadLockWithMain {

    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();

        System.out.println(currentThread+" thread start ");

        try {
            //currentThread.join(); // dead lock situation
            currentThread.join(10); // not a dead lock situation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(currentThread+" thread end ");
    }

}
