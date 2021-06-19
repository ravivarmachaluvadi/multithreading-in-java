package com.practice.multithreading.executorservice.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

	public static void main(String[] args) {

		System.out.println("Main start");

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		//ExecutorService executorService = Executors.newFixedThreadPool(3);

		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				for (int i = 1; i < 6; i++) {
					System.out.println("My Task1..");
				}
			}
		};
		
		Runnable task2 = ()->{
			System.out.println(Thread.currentThread().getName());
			for (int i = 1; i < 6; i++) {
			System.out.println("My Task2..");
			}
		};
		
		MyTask task3 = new MyTask();

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);

		executorService.shutdown();

		//executorService.shutdownNow();

		System.out.println("Main end");
	}
}

/*
Main start
Main end
pool-1-thread-1
My Task1..
My Task1..
My Task1..
My Task1..
My Task1..
pool-1-thread-1
My Task2..
My Task2..
My Task2..
My Task2..
My Task2..
pool-1-thread-1
My Task3..
My Task3..
My Task3..
My Task3..
My Task3..
 */


/*
executorService.shutdownNow();

Main start
Main end
pool-1-thread-1
My Task1..
My Task1..
My Task1..
My Task1..
My Task1..
 */