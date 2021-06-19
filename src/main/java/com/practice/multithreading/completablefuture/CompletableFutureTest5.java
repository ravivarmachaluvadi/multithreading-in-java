package com.practice.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->"Hello,").
		thenCompose(s->CompletableFuture.supplyAsync(()->s+"World!!"));
		
		System.out.println(completableFuture.get());
		
		System.out.println("-------------------------------------");

		//working with two independent futures
		CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(()->"Hello,").
		thenCombine(CompletableFuture.supplyAsync(()->"World..."), (s1,s2)->s1+s2);
		
		System.out.println(completableFuture2.get());
		System.out.println("-------------------------------------");
		CompletableFuture.supplyAsync(()->"Hello,").
		thenAcceptBoth(CompletableFuture.supplyAsync(()->"World!!!!..."), (s1,s2)->System.out.println(s1+s2));
		
	}

}
/*
Hello,World!!
-------------------------------------
Hello,World...
-------------------------------------
Hello,World!!!!...
 */