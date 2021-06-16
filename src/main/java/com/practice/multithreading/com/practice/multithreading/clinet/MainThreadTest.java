package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.scanario1.ChildThread;

public class MainThreadTest {
	public static void main(String[] args) {
		//Getting reference to the currently executing thread object
		Thread t = Thread.currentThread();
        
        //Getting name of Main thread
        System.out.println("Current thread: " + t.getName());
         
        // changing the name of Main thread
        t.setName("KK JavaTutorilas");
        System.out.println("After name change: " + t.getName());
         
        //Getting priority of Main thread
        System.out.println("Main thread priority: "+ t.getPriority());
         
        //Setting priority of Main thread
        t.setPriority(Thread.MAX_PRIORITY);
         
        System.out.println("Main thread new priority: "+ t.getPriority());
         
        // Main thread creating a child thread
        ChildThread ct = new ChildThread();
         
        //Getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: "+ ct.getPriority());
         
        //Setting priority of Main thread to MIN(1)
        ct.setPriority(Thread.MIN_PRIORITY);
         
        System.out.println("Child thread new priority: "+ ct.getPriority());
         
        //Starting child thread
        ct.start();
	}
}

/*
Current thread: main
After name change: KK JavaTutorilas
Main thread priority: 5
Main thread new priority: 10
Child thread priority: 10
Child thread new priority: 1
Child thread
Child thread
Child thread
Child thread
Child thread
 */