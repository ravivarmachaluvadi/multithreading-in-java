package com.practice.multithreading.exception;

import com.practice.multithreading.workers.MyThread;

public class DefaultUncaughtExceptionHandlerTest {

	public static void main(String args[]) {
		// Register a Default Uncaught Exception Handler for your program
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				// do some good stuff here, like logging or sending an alert
				// email to the Support team
				System.out.println(t.getName()+" thread end with following exception:::");
				System.out.println(e.getMessage());
			}
		});

		// somewhere down the line your program throws an exception.
		// this should get handled by Default Uncaught exception handler that we have registered.
		Thread t1 = new Thread(new MyThread(), "T1");
		t1.start();
	}
}