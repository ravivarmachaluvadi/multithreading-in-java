package com.practice.multithreading.scanario1;

public class LockThread1 implements Runnable {

    private Object lock1;
    private Object lock2;

    public LockThread1(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }



    @Override
    public void run() {
        synchronized (lock1){
            System.out.println(Thread.currentThread().getName()+" locked resource one ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock2){
                System.out.println(Thread.currentThread().getName()+" locked resource two ");
            }
        }

    }
}
