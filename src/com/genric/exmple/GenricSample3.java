package com.genric.exmple;

import java.util.ArrayList;
import java.util.List;

public class GenricSample3 {
    
    public static <T> T returnMe(T t) {
	// Check instance matches with stuff
	//if not 
	System.out.println(t);
	
	return t;
    }
    
    
    public static void main(String[] args) {
	List<Integer> number= new ArrayList<Integer>();
	number.add(1);
	number.add(2);
	returnMe(number);
    }

}
