package com.main.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class FroukJoinPool {
    
    
  public static int transformer(int number)  {
      
    System.out.println("Transfaremer"+number+""+Thread.currentThread());  
    
    return number;
      
  }
  
  public static void process(Stream<Integer> stream) throws Exception {
      
      ForkJoinPool pool = new ForkJoinPool(50);
      
      pool.submit(()->stream.forEach(e->{}));
      
      pool.shutdown();
      pool.awaitTermination(30, TimeUnit.SECONDS);
      
  }
  
  public static void main(String args[]) throws Exception{
      
    List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20);
   Stream<Integer> stream= numbers.stream().parallel()
	    			  .map(FroukJoinPool::transformer);	
    
    process(stream);
	    
      
      
  }

}
