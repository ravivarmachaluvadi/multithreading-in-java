package com.practice.multithreading.workers;

public class MyThreadGroup extends ThreadGroup {
	public MyThreadGroup(String name) {
		super(name);
	}

	//Keep your exception handling code here.
	@Override
	public void uncaughtException(Thread thread, Throwable t) {
		ThreadGroup threadGroup = thread.getThreadGroup();
		System.out.println(threadGroup);
		System.out.println(thread.getName()+" thread end with following exception:::");
		System.out.println(t.getMessage());
	}
}