package com.practice.multithreading.executorservice.pool;

import com.practice.multithreading.executorservice.single.MyTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServicePoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task1 = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                    System.out.println("My Task1 started..");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("My Task1 ended..");
                }
        };

        Runnable task2 = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                    System.out.println("My Task2 started..");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("My Task2 ended..");
                }
        };


        Runnable task3 = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                    System.out.println("My Task3 started..");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("My Task3 ended..");
                }
        };

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();

    }
}
