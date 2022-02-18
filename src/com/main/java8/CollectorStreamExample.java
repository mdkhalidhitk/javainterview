package com.main.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorStreamExample {
    
    
    public static void main(String[] args) {
  	List<Integer> numbers= Arrays.asList(1,2,3,4,5,1,2,3,4,5);
  	List<Integer>  doubleEven= new ArrayList<>();
  	
  	
  	numbers.stream()
  		.filter(e ->e%2==0)
  		.map(e -> e*2)
  		.forEach(e ->doubleEven.add(e));
  	System.out.println(doubleEven);
  	// List
  	List<Integer>  doubleEven2=
  		numbers.stream()
  			.filter(e -> e % 2 ==0)
  			.map(e -> e*2)
  			.collect(Collectors.toList());
  	System.out.println("List"+doubleEven2);
  	// convert Into set
  	
  	Set<Integer>  doubleEven3=
  		 numbers.stream()
		.filter(e -> e % 2 ==0)
		.map(e -> e*2)
		.collect(Collectors.toSet());
  	System.out.println("Set"+doubleEven2);
  			
  	
  	
  	
  	
  	
    }

    
    
    
    
}
