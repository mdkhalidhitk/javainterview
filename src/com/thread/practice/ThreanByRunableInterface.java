package com.thread.practice;

public class ThreanByRunableInterface implements Runnable {

    @Override
    public void run() {
	for (int i = 0; i < 19; i++) {
	    System.out.println(i);
	    
	}
	
    }
    public static void main(String[] args) {
	ThreanByRunableInterface th= new ThreanByRunableInterface();
	Thread t1= new Thread(th);
	t1.setPriority(6);
	t1.start();
    }

}
