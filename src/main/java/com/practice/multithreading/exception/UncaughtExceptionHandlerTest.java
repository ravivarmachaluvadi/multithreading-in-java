package com.practice.multithreading.exception;

public class UncaughtExceptionHandlerTest {

	public static void main(String[] args) throws Exception {

		Thread.currentThread().setUncaughtExceptionHandler(
				new Thread.UncaughtExceptionHandler() {

					// Your exception handling code goes inside this method.
					@Override
					public void uncaughtException(Thread t, Throwable e) {
						System.out.println(t.getName()+" thread end with following exception:::");
						System.out.println(e.getMessage());
					}
				});

		// assume exception occured during execution of this thread.
		// here our thread is Main Thread.
		throw new Exception("exception thrown from somewhere in your program");
	}
}