package com.thread.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallableExcutor {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService ex=Executors.newSingleThreadExecutor();
	ex.execute(new Runnable() {
	    
	    @Override
	    public void run() {
		System.out.println("Excutor Service");
		
	    }
	});
	
	Future<String> fu=ex.submit(new Callable<String>() {

	    @Override
	    public String call() throws Exception {
		System.out.println("Result Of String");
		return "RESULT";
	    }
	});
	System.out.println("fu.get()"+fu.get());
	
    }

}
