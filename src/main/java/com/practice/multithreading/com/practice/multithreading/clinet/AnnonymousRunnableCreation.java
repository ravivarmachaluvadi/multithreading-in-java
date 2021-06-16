package com.practice.multithreading.com.practice.multithreading.clinet;

public class AnnonymousRunnableCreation {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {

            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+" , i ="+i);

                }
            }
        };

        Thread thread1= new Thread(runnable,"T1");
        Thread thread2= new Thread(runnable,"T2");
        Thread thread3= new Thread(runnable,"T3");

        thread1.start();
        thread2.start();
        thread3.start();

        Runnable runnable2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+" , i ="+i);

            }
        };

        Thread thread4= new Thread(runnable2,"T4");
        Thread thread5= new Thread(runnable2,"T5");

        thread4.start();
        thread5.start();

    }
}
