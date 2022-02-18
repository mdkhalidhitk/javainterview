//package com.main.java8;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Java8NewFeture {
//    
//    public static int computeNmber(int number) {
//   	
//
//   	return number*2;
//   	
//   	
//   	
//       }
//    public static void main(String[] args) {
//	List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	numbers.stream()
//	       .map(e -> e.toString())
//		.map(String::valueOf)
//	       .forEach(System.out::println);
//	
//	
///*	System.out.println(
//		number.stream()
//		       .reduce(0, (total,e) ->Integer.sum(total, e))
//		Method Refrence work only when method signatre and order parameter should be same 
//		.reduce(0, Integer::sum));
//		*/
//	
//	System.out.println(
//		numbers.stream()
//		.map(String::valueOf)
//		.reduce("", (cary,str) -> cary.concat(str))
//		// by method refrences 
//		//.reduce("", String::concat)
//		
//		);
//	
//	System.out.println(
//		numbers.stream()
//		.filter(e  -> e%2==0)
//		.map(e -> e*2)
//		.reduce(0 ,Integer::sum )
//		// we are doing out boxing
//		//.mapToInt(e -> e*2)
//		//.sum()
//		);
//	
//	
//	
//	
//	
//	
//	
//	
//		
//	
//		
//		
//	
//	
//    }
//    
//    
//   
//
//}
