package com.practice.multithreading.callable.multitasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllTasksTest {
	public static void main(String[] args) {
		ExecutorService executorService = null;
		try {
			executorService = Executors.newFixedThreadPool(3);
			
			Callable<String> task1 = new Callable<String>() {
				public String call() throws Exception {
					Thread.sleep(2000);
					return "Result of Task1";
				}
			};

			Callable<String> task2 = new Callable<String>() {
				public String call() throws Exception {
					Thread.sleep(2000);
					return "Result of Task2";
				}
			};

			Callable<String> task3 = new Callable<String>() {
				public String call() throws Exception {
					Thread.sleep(1500);
					return "Result of Task3";
				}
			};

			Callable<String> task4 = new Callable<String>() {
				public String call() throws Exception {
					Thread.sleep(2000);
					return "Result of Task4";
				}
			};

			List<Callable<String>> taskList = new ArrayList<>();
			taskList.add(task1);
			taskList.add(task2);
			taskList.add(task3);
			taskList.add(task4);

			List<Future<String>> futures;
			try {
				long millis1 = System.currentTimeMillis();
				futures = executorService.invokeAll(taskList);
				for (Future<String> future : futures) {
					System.out.println(future.get());
				}
				long millis2 = System.currentTimeMillis();

				System.out.println("Time taken for executing 4 tasks : "+(millis2-millis1));

			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(executorService != null)
			executorService.shutdown();
		}
	}
}
/*
Result of Task1
Result of Task2
Result of Task3
Result of Task4
Time taken for executing 4 tasks : 3506
 */