package com.practice.multithreading.completablefuture.exception;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		String name = null;
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
			if(name == null){
				throw new RuntimeException("Computation Error!!!");
			}
			return "Hello,"+name; // success use case
		}).handle((s,t)->s!=null?s:"Hello,Stranger!!"); // handing exception
		
		System.out.println(completableFuture.get());
	}
}
/*
Hello,Stranger!!
 */