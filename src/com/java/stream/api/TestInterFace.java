package com.java.stream.api;

public interface TestInterFace {
	// abstract method
    public void square(int a);
  
    // default method
    default int show()
    {
      System.out.println("Default Method Executed");
	return 0;
    }
    
    static void show1()
    {
        System.out.println("Static Method Executed");
    }
    
    public default void parentMethod(){ 
    	System.out.println("Hello"); 
    	}
}


