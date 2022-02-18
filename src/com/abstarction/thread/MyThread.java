package com.abstarction.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("My  Extend Thread");
		for (int i = 1; i < 10; i++) {
			System.out.println("My  Extend Thread " + i);
		}
	}
}
