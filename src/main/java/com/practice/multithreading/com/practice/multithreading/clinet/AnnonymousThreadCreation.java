package com.practice.multithreading.com.practice.multithreading.clinet;

public class AnnonymousThreadCreation {

    public static void main(String[] args) {

        Thread thread= new Thread("T1"){

            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+" , i ="+i);

                }
            }
        };

        Thread thread2= new Thread("T2"){

            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+" , i ="+i);

                }
            }
        };
        thread.start();
        thread2.start();
    }
}

/*
T2 , i =0
T1 , i =0
T2 , i =1
T1 , i =1
T2 , i =2
T1 , i =2
T2 , i =3
T1 , i =3
T2 , i =4
T1 , i =4
 */

