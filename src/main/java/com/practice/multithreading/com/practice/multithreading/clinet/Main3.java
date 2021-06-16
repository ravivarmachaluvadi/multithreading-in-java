package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.scanario1.MyThread2;

public class Main3 {


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
        thread3.start();

        System.out.println(thread1.getName() +" "+thread1.getPriority());
        System.out.println(thread2.getName() +" "+thread2.getPriority());
        System.out.println(thread3.getName() +" "+thread3.getPriority());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

        /*
        t3	 i =0
t2	 i =0
t1 5
t1	 i =0
t2 5
t3 5
main 5
t2	 i =1
t1	 i =1
t3	 i =1
t1	 i =2
t2	 i =2
t3	 i =2
t1	 i =3
t2	 i =3
t3	 i =3
t1	 i =4
t2	 i =4
t3	 i =4
t2	 i =5
t1	 i =5
t3	 i =5
         */

    }

}
