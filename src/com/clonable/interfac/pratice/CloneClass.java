package com.clonable.interfac.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CloneClass  {
	
	public void testClone() {
		
		
		MyCloneClass x1 = new MyCloneClass();
		MyCloneClass x2; 
		x1.a = 15; 
		x1.b = 35.05; 
		x2 = x1.getClone(); // claone of x1
		
		System.out.println(" x1: " + x1.a + " " + x1.b);
		System.out.println(" x2: " + x2.a + " " + x2.b);
		

	}
	public static void main(String[] args) {
		
		CloneClass testCloneObject = new CloneClass(); //
		//test via protected 
		testCloneObject.testClone();
		Map<Integer, String> map= new HashMap<>();
		HashMap<Integer, String> myMap= new HashMap<>();
		Map<Integer, String> sortmap;
		SortedMap<Integer, String> sortmap1= new  TreeMap<>();
		
		
		

		
	}

}
