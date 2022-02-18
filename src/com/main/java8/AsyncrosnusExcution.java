package com.main.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncrosnusExcution {

	public static int generate() throws Throwable {
		System.out.println("doing=== work");
		Sleep.sleep(2000);
		return 2;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		// CompletableFuture.runAsync(()-> System.out.println("do work"));
		CompletableFuture.supplyAsync(() -> {
			System.out.println("doing  work");
			return 2;
		});

	}

}
