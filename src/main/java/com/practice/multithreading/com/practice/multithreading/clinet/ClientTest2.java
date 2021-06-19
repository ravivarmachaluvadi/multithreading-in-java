package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.syncblockstaticvar.MakingCounter;

public class ClientTest2 {
	public static void main(String[] args)  {
		
		MakingCounter r = new MakingCounter();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Counter final Value:"+r.getCounter());
	}
}
/*
39999
 */