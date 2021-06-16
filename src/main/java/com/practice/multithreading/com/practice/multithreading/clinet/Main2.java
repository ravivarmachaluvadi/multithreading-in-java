package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.scanario1.MyThread2;

public class Main2 {

    public static void main(String[] args) {
        MyThread2 myThread= new MyThread2();

        Runnable target;
        Thread thread1=new Thread(myThread);
        thread1.setName("t1");

        Thread thread2=new Thread(myThread);
        thread2.setName("t2");

        Thread thread3=new Thread(myThread);
        thread3.setName("t3");

        thread1.start();
        thread2.start();
        try {
            thread1.start(); //java.lang.IllegalThreadStateException
        }
        catch (IllegalThreadStateException illegalThreadStateException){
            System.out.println(" inside catch block ");
        }
        /*
        t2	 i =0
t1	 i =0
t2	 i =1
t1	 i =1
t2	 i =2
t1	 i =2
t1	 i =3
t2	 i =3
t1	 i =4
t2	 i =4
t1	 i =5
t2	 i =5
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:792)
	at com.practice.multithreading.com.practice.multithreading.clinet.Main2.main(Main2.java:19)
        * */

        thread3.start(); // wont get executed
        /*
        if the line is inside catch which causes exception , wont terminate execution immediately
        * */
    }


}
