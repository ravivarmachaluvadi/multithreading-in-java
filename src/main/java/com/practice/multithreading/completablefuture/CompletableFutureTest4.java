package com.practice.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//supplier
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->"Beatiful");
		 completableFuture = completableFuture.thenApply(s->s+" World!!!");
		 
		 String result = completableFuture.get();
		 System.out.println(result);
		 
		 System.out.println("---------------------------------------------------");
		 
		 CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(()->"Beatiful");

		 //consumer
		 completableFuture2.thenAccept(s->{
			 System.out.println("My Computation is done::"+s);
		 });
		 //completableFuture2.get();
		 
		 CompletableFuture<String> completableFuture3 = CompletableFuture.supplyAsync(()->"Beatiful");

		 //runable
		 completableFuture3.thenRun(()->System.out.println("My Task is done.."));
		 
		 //completableFuture3.get();
		
	}
}
/*
Beatiful World!!!
---------------------------------------------------
My Computation is done::Beatiful
My Task is done..
 */