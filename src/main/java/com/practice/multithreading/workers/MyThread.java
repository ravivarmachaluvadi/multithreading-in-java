package com.practice.multithreading.workers;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+",i = "+i);
			if(i == 5){
				throw new RuntimeException("My Runtime exception..");
			}
		}
	}
}