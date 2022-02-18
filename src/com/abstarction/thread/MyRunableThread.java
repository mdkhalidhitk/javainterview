package com.abstarction.thread;

public class MyRunableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("My  implemented Thread");
		for (int i = 1; i < 10; i++) {
			System.out.println("My  implemented Thread " + i);
		}

	}

}
