package com.practice.multithreading.workers;

public class MyThreadYield implements Runnable {

	public void run() {
		for (int i = 1; i <=10; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName+"\t"+"i = "+i);
			if("T1".equals(threadName)){
				Thread.yield();
			}
		}
	}
}