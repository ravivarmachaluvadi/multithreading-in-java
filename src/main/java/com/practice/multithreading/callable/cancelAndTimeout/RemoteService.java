package com.practice.multithreading.callable.cancelAndTimeout;

public class RemoteService {

	public String remoteService(){
		try {
			//Thread.sleep(2);
			Thread.sleep(25);
			//Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Remote Service";
	}
}