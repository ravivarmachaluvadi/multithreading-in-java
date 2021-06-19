package com.practice.multithreading.scheduledexecutor;

public class MyTask implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("My task started..");
		
		System.out.println("My task End..");
	}
}