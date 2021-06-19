package com.practice.multithreading.callable.cancelAndTimeout;

import java.util.concurrent.Callable;

public class MyTask implements Callable<String>{

	private RemoteService remoteService;
	
	public MyTask(RemoteService remoteService) {
		this.remoteService = remoteService;
	}

	public String call() throws Exception {
		return remoteService.remoteService();
	}

}