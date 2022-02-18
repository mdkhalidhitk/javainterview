package com.thread.practice;

public class Calculator extends Thread {
    long sum=0;
    @Override
    public void run() {
	synchronized (this) {
	for (int i = 0; i <1000; i++) {
	   sum +=i;
	   
       }
       notify();
    } 
       
    }
    public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.start();
	//When Thread is not notfiy
	 /*synchronized (cal) {
	    try {
		cal.wait();
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	}
	 */
	//System.out.println("sum"+cal.sum);// out put=0
	//After Notify
	 synchronized (cal) {
	    try {
		cal.wait();
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	}
	 
	System.out.println("sum"+cal.sum);// out put=0
	 
	
    }

}
