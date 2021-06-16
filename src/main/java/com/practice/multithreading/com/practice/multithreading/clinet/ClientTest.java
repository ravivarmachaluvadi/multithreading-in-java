package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.workers.MakingCounter;

public class ClientTest {
	public static void main(String[] args)  {
		
		MakingCounter r = new MakingCounter();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join(); // Counter final Value:20000
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Counter final Value:"+r.getCounter());
	}
}

/*
output:
with out join() : Counter final Value:159
with join() : :40000
 */

// Parent thread (here main is the parent thread) will wait for joined child thread to die