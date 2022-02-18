package com.java.stream.api;

public interface TestInterface2 extends TestInterFace {

	 // default method
    default int show()
    {
      System.out.println("Default Method Executed");
	return 0;
    }
}
