package com.java.stream.api;

import java.util.stream.Stream;

public class MyCompany implements Apple, Google {

	
	public String display() {
		System.out.println("some");
		
		return "Apple";
	}
	
	public static void main(String[] args) {
		MyCompany mu= new MyCompany();
		mu.display();
		Stream<String> str=Stream.of("a", "b", "c");
		
		
		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		System.out.println(streamGenerated.findFirst().get());
		
	}

	

}
