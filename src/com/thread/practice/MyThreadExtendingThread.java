package com.thread.practice;

public class MyThreadExtendingThread extends Thread {
    
   
    @Override
    public void run() {
       for(int i=1; i<=10;i++) {
	   System.out.println(i);
       }
    }
    public static void main(String[] args) {
	MyThreadExtendingThread my= new MyThreadExtendingThread();
	
	my.start();
	
	
    }

}
