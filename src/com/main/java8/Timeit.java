package com.main.java8;

public class Timeit {
    
    public static void code(Runnable block) {
	long stratTime=System.nanoTime();
	
	try {
	  block.run();  
	    
	}finally {
	    long endTime=System.nanoTime();
	    System.out.println("Time take(S)"+(endTime-stratTime)/1.0e9	);
	    
	    
	}
	
    }

}
