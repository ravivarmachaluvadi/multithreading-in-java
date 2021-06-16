package com.practice.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumerTest {

	public static void main(String[] args) {

		Queue<Integer> sharedQueue = new LinkedList<>();
		
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();

		/*
		Produced::4
Produced::1
Produced::0
Consumed::4
Consumed::1
Consumed::0
Consumer is waiting to produce objects by Produder..
Produced::4
Produced::4
Produced::1
Produced::0
Produced::2
Producer is waiting to consume object by comsumer..
Consumed::4
Consumed::4
Consumed::1
Consumed::0
Consumed::2
Consumer is waiting to produce objects by Produder..
		 */
	}

}