package com.main.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;


public class ParallelStream {
    public static int transfarmer(int number)  {
	
	System.out.println("TransferFormar"+ number+""+Thread.currentThread());
	//Thread.sleep(2000);
	return number;
    }
    
    public static void printIt(int number) {
	
	System.out.println(number+""+Thread.currentThread());
    }
    
    public static void main(String[] args) {
	List<Integer> number= Arrays.asList(2,3,4,5,6,7,8,9);
	
//	  number.stream()
//	  	.parallel()
//	  	.map(t -> {
//		    try {
//			return transfarmer(t);
//		    } catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		    }
//		    return t;
//		})
//	  	.sorted()
//	  	//.sequential()// last stream follow  will work  if we are parralle or sequtionl
//		.forEachOrdered(System.out::println);
	
	System.out.println(Runtime.getRuntime().availableProcessors());
	ForkJoinPool pool=ForkJoinPool.commonPool();
	System.out.println(pool);
    }

}
