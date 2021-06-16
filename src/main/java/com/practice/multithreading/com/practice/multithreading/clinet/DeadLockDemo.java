package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.scanario1.LockThread1;
import com.practice.multithreading.scanario1.LockThread2;

public class DeadLockDemo {
    public static void main(String[] args) {

        Object lock1=new Object();
        Object lock2=new Object();

        LockThread1 lockThread1= new LockThread1(lock1,lock2);
        LockThread2 lockThread2= new LockThread2(lock1,lock2);

        Runnable target;
        Thread t1= new Thread(lockThread1,"T1");
        Thread t2= new Thread(lockThread2,"T2");

        t1.start();
        t2.start();

    }
}

// OutPut for non dead lock situation
/*
T1 locked resource one
T1 locked resource two
T2 locked resource one
T2 locked resource two
 */


/*
Out Put for dead lock situation :

T2 locked resource two
T1 locked resource one


jvisualvm or jstack out put :

Found one Java-level deadlock:
=============================
"T1":
  waiting to lock monitor 0x00007fc89a606b00 (object 0x000000070fe46350, a java.lang.Object),
  which is held by "T2"

"T2":
  waiting to lock monitor 0x00007fc89a605600 (object 0x000000070fe46340, a java.lang.Object),
  which is held by "T1"

Java stack information for the threads listed above:
===================================================
"T1":
	at com.practice.multithreading.scanario1.LockThread1.run(LockThread1.java:27)
	- waiting to lock <0x000000070fe46350> (a java.lang.Object)
	- locked <0x000000070fe46340> (a java.lang.Object)
	at java.lang.Thread.run(java.base@15.0.2/Thread.java:832)
"T2":
	at com.practice.multithreading.scanario1.LockThread2.run(LockThread2.java:31)
	- waiting to lock <0x000000070fe46340> (a java.lang.Object)
	- locked <0x000000070fe46350> (a java.lang.Object)
	at java.lang.Thread.run(java.base@15.0.2/Thread.java:832)

Found 1 deadlock.

 */