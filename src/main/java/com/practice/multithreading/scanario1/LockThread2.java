package com.practice.multithreading.scanario1;

public class LockThread2 implements Runnable{

    private Object lock1;
    private Object lock2;

    public LockThread2(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }



    @Override
    public void run() {
        synchronized (lock2){ // dead lock situation
            //synchronized (lock1){  //fix for deadlock
            //System.out.println(Thread.currentThread().getName()+" locked resource one ");
            System.out.println(Thread.currentThread().getName()+" locked resource two ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock1){ // dead lock situation
                //synchronized (lock2){ //fix for deadlock
                //System.out.println(Thread.currentThread().getName()+" locked resource two ");
                System.out.println(Thread.currentThread().getName()+" locked resource one ");
            }
        }

    }
}
