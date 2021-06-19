package com.practice.multithreading.syncblockstaticvar;

public class MakingCounter implements Runnable {

	private static int counter;
	
	@Override
	public void run() {
		for (int i = 1; i <=1001; i++) {
				increment();
		}
	}


	//synchronized block
/*
private void increment() {
		//String tName = Thread.currentThread().getName();
		//System.out.println(tName);
		 synchronized (this) {
			counter++;
		}
	}
	*/


/*	private  static synchronized void increment() {
		//String tName = Thread.currentThread().getName();
		//System.out.println(tName);
			counter++;
	}*/


private static  void increment() {
		//String tName = Thread.currentThread().getName();
		//System.out.println(tName);
		 synchronized (MakingCounter.class) {
			counter++;
		}
	}

	public static int getCounter() {
		return counter;
	}
}