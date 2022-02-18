package com.thread.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ExcutorServiceThread {
    
    public static void main(String[] args) {
	
    
    ExecutorService executorService=Executors.newSingleThreadExecutor();
    
    executorService.execute(new Runnable() {
        
        @Override
        public void run() {
    System.out.println("from excutorService");
    	
        }
    });
    
    
    System.out.println("end of services ");
    
   // executorService.shutdown();
    
    ExecutorService excutor=Executors.newFixedThreadPool(10);
    ExecutorService excutor1=Executors.newScheduledThreadPool(10);
    java.util.concurrent.Future<?> fu= executorService.submit(new Runnable() {
        
        @Override
        public void run() {
            System.out.println("From feture of services ");
            
    	
        }
    });
    
    System.out.println("From feture of services fu.getClass(); "+fu.getClass()); 
    
    }
   
	

    

}
