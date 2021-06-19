package com.practice.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class RunAsyncSupplyAsync {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		
		CompletableFuture.runAsync(()->{
			System.out.println("My task1 is completed.. by thread : "+Thread.currentThread().getName());
		});
		
		System.out.println("**********************************");
		
		CompletableFuture.runAsync(()->{
			System.out.println("My task2 is completed.. by thread : "+Thread.currentThread().getName());
		},Executors.newFixedThreadPool(2));
		
		System.out.println("###################################");
		
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()->"Hello World! by thread : "+Thread.currentThread().getName());
		System.out.println(supplyAsync.get());
		System.out.println("----------------------------------");
		CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(()-> "Hello World!!! by thread : "+Thread.currentThread().getName(),Executors.newCachedThreadPool());
		System.out.println(supplyAsync2.get());

	}
}
/*
**********************************
###################################
My task1 is completed.. by thread : ForkJoinPool.commonPool-worker-19
My task2 is completed.. by thread : pool-1-thread-1
Hello World! by thread : ForkJoinPool.commonPool-worker-19
----------------------------------
Hello World!!! by thread : pool-2-thread-1
 */