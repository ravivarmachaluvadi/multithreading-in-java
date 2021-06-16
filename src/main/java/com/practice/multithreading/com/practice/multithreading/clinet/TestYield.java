package com.practice.multithreading.com.practice.multithreading.clinet;

import com.practice.multithreading.workers.MyThreadYield;

public class TestYield {

	public static void main(String[] args) {
		MyThreadYield r = new MyThreadYield();
		
		Thread t1 = new Thread(r, "T1");
		Thread t2 = new Thread(r,"T2");
		//t2.setPriority(Thread.MAX_PRIORITY); this line wont have any efect on the output
		t1.start();
		t2.start();
	}

}
/*
T1	i = 1
T2	i = 1
T1	i = 2
T2	i = 2
T1	i = 3
T1	i = 4
T2	i = 3
T1	i = 5
T2	i = 4
T1	i = 6
T2	i = 5
T1	i = 7
T2	i = 6
T1	i = 8
T2	i = 7
T1	i = 9
T2	i = 8
T2	i = 9
T1	i = 10
T2	i = 10
 */