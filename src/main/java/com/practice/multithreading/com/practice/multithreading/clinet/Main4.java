package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.scanario1.MyThread2;

public class Main4 {

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();

        Runnable target;
        Thread thread1 = new Thread(myThread);
        thread1.setName("t1");
        thread1.setPriority(1);

        Thread thread2 = new Thread(myThread);
        thread2.setName("t2");

        Thread thread3 = new Thread(myThread);
        thread3.setName("t3");
        thread3.setPriority(9);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(thread1);
        System.out.println(thread2);
        System.out.println(thread3);
        System.out.println(Thread.currentThread());

        /*
Thread[thread_name,thread_priority,threadGroupname]

Thread[t1,1,main]
Thread[t2,5,main]
Thread[t3,9,main]
Thread[main,5,main]
t2	 i =0
t3	 i =0
t1	 i =0

high priority thread doesn't guarantee you that it will always get invoked for first time
         */

    }

    }
