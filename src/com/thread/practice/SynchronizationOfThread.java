package com.thread.practice;

public class SynchronizationOfThread {
    public static void main(String[] args) throws InterruptedException {
	for (int i = 0; i <5; i++) {
	    System.out.println(i);
	}
	Thread a= new Thread ();
	Thread a1= new Thread ();
	Thread a2= new Thread ();
	a.start();
	a2.join(20000);
	a2.sleep(8900);
	a1.yield();
	
    }

}
