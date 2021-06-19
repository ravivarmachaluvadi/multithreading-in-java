package com.practice.multithreading.executorservice.single;

public class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i < 6; i++) {
			System.out.println("My Task3..");
		}
	}
}