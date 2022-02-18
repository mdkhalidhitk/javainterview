package com.main.java8;

public class Sleep extends Thread {
    
    @Override
    
	public void run() {
	    
	}
    
public static Thread sleep(int number) throws Exception{
	 Thread th= new Thread();
	 th.start();
	 Thread.sleep(number);
	
	return th;
	
	
	
    }

}
