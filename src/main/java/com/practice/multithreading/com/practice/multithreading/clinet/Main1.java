package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.scanario1.MyThread1;

public class Main1 {


    public static void main(String[] args) {

        MyThread1 t1= new MyThread1();
        MyThread1 t2= new MyThread1();
        t1.start();
        t2.start();

        for (int i = 1; i <=5 ; i++) {
            System.out.println(" for loop up i = "+i);
        }

        for (int i = 6; i <=10 ; i++) {
            System.out.println(" for loop down i = "+i);
        }
    }
}


/*
for loop up i = 1
 for loop up i = 2
 for loop up i = 3
 for loop up i = 4
 for loop up i = 5
 for loop down i = 6
 for loop down i = 7
 for loop down i = 8
 for loop down i = 9
 for loop down i = 10
 current threadThread-0	 i =0
 current threadThread-1	 i =0
 current threadThread-1	 i =1
 current threadThread-0	 i =1
 current threadThread-0	 i =2
 current threadThread-1	 i =2
 current threadThread-0	 i =3
* */