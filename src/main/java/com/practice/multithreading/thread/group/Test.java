package com.practice.multithreading.thread.group;

import com.practice.multithreading.scanario1.MyThread1;

public class Test {

	public static void main(String[] args) {
		MyThread1 r = new MyThread1();
		
		ThreadGroup groupA = new ThreadGroup("groupA");
		ThreadGroup groupB = new ThreadGroup("groupB");
		
		Thread t1 = new Thread(groupA,r, "T1");
		Thread t2 = new Thread(groupA,r,"T2");
		Thread t3 = new Thread(groupA,r, "T3");
		Thread t4 = new Thread(groupA,r,"T4");
		
		Thread t5 = new Thread(groupB,r, "T5");
		Thread t6 = new Thread(groupB,r,"T6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		groupA.setMaxPriority(Thread.MAX_PRIORITY);
		int activeCount = groupA.activeCount();
		System.out.println("activeCount in GroupA:"+activeCount);
		groupB.list();
		groupA.list();

	}
}

/*

activeCount in GroupA:4
java.lang.ThreadGroup[name=groupB,maxpri=10]
    Thread[T5,5,groupB]
    Thread[T6,5,groupB]
java.lang.ThreadGroup[name=groupA,maxpri=10]
    Thread[T1,5,groupA]
    Thread[T2,5,groupA]
    Thread[T3,5,groupA]
    Thread[T4,5,groupA]
T2	 i =0
T1	 i =0
T4	 i =0
T5	 i =0
T6	 i =0
T3	 i =0
T1	 i =1
T4	 i =1
T2	 i =1
T6	 i =1
T3	 i =1
T5	 i =1
T4	 i =2
T6	 i =2
T3	 i =2
T1	 i =2
T2	 i =2
T5	 i =2
T4	 i =3
T1	 i =3
T2	 i =3
T3	 i =3
T6	 i =3
T5	 i =3
T1	 i =4
T4	 i =4
T2	 i =4
T3	 i =4
T6	 i =4
T5	 i =4
T1	 i =5
T2	 i =5
T4	 i =5
T3	 i =5
T6	 i =5
T5	 i =5
 */