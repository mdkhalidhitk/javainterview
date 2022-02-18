package com.abstarction.thread;

import java.util.concurrent.ExecutionException;

public class MainClientThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyThread myThread = new MyThread();
		// myThread.run();
		myThread.setPriority(Thread.MAX_PRIORITY);
		myThread.setPriority(2);
		 myThread.start();
		MyRunableThread myRunableThread = new MyRunableThread();
		Thread thread = new Thread(myRunableThread);
		myThread.join(80000);
		thread.start();
		MyExecutorThread.excuterCallableService();
		System.out.println("Main thread");
		for (int i = 1; i < 11; i++) {
			System.out.println("My  Main Thread " + i);
		}
		
	}
}
