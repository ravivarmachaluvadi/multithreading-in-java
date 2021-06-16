package com.practice.multithreading.exception;

import com.practice.multithreading.workers.MyThread;
import com.practice.multithreading.workers.MyThreadGroup;

public class ThreadGroupUncaughtExceptionHandlerTest {

	public static void main(String[] args) {
		MyThreadGroup myThreadGroup = new MyThreadGroup("MyThreadGroup");
		
		// Create a thread and assign it to myThreadGroup
		Thread t1 = new Thread(myThreadGroup,new MyThread(), "T1");
		t1.start();
	}
}