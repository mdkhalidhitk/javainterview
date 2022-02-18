package com.abstarction.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutorThread {

	public static void excuterService() throws InterruptedException, ExecutionException {

		ExecutorService ex = Executors.newSingleThreadExecutor();

		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

		ExecutorService schedulerThreadPool = Executors.newScheduledThreadPool(10);

		ex.execute(() -> {
			Thread.currentThread().setPriority(3);
			for (int i = 1; i < 10; i++) {
				// System.out.println("My MyExecutor Thread " + i);
			}
		});
		System.out.println("shutdown My  MyExecutor Thread ");

		ex.shutdown();

		Future feture = schedulerThreadPool.submit(() -> {
			Thread.currentThread().setPriority(3);
			for (int i = 1; i < 10; i++) {
				System.out.println("My  MyExecutor Submit() Thread  " + i);
			}
		});
		System.out.println("My  MyExecutor feture.get() Thread: " + feture.get());
	}

	public static void excuterCallableService() throws InterruptedException, ExecutionException {

		ExecutorService ex = Executors.newSingleThreadExecutor();

		Future feture = ex.submit(() -> {
			Thread.currentThread().setPriority(3);
			int sum = 0;
			for (int i = 1; i < 10; i++) {
				System.out.println("My  MyExecutor excuterCallableService() Thread  ");
				sum += i;
			}
			System.out.println("Sum Result" + sum);
			return sum;
		}

		);
		
		System.out.println("My  MyExecutor excuterCallableService feture.get() Thread: " + feture.get());
	}

}
