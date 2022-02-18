package com.desgined.pattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Singleton1StLock {

    private static Singleton1StLock SINGLE_INSTANCE = null;

    private Singleton1StLock() {
    }

    public static Singleton1StLock getInstance() {

	if (SINGLE_INSTANCE == null) {
	    synchronized (Singleton1StLock.class) {
		SINGLE_INSTANCE = new Singleton1StLock();
	    }
	}

	return SINGLE_INSTANCE;
    }
    
    
    public static void main(String[] args) {
	
  	List<String> list = Arrays.asList("abc", "def", "ghi");
  	List<String> upped = list.stream().map(String::toUpperCase).collect(Collectors.toList());
  	upped.stream().forEach(System.out::println);
      }

}
