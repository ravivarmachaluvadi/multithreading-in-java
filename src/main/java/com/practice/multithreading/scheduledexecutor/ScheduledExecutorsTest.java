package com.practice.multithreading.scheduledexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsTest {

	public static void main(String[] args) {

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		
		MyTask myTask = new MyTask();
		
		scheduledExecutorService.schedule(myTask, 5, TimeUnit.SECONDS);
		
		scheduledExecutorService.shutdown();
	}

}
/*
pool-1-thread-1
My task started..
My task End..
 */