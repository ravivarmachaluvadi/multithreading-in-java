package com.practice.multithreading.workers;


public class MakingCounter implements Runnable {

	private int counter;
	//AtomicInteger atomicInteger = new AtomicInteger(0);
	
	@Override
	public void run() {
		for (int i = 1; i <=20000; i++) {
			//counter++; // compount operation means not a atomic operation
				increment();
		}
	}

	private synchronized void increment() { // by using synchronized blocks or creating synchronized methods we will make the
		//the operation as atomic
		counter++;
		//atomicInteger.getAndIncrement();
	}
	public int getCounter() {
		return counter;
		//return atomicInteger.get();
	}
}