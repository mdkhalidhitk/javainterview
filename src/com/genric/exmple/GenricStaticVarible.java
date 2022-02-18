package com.genric.exmple;

public class GenricStaticVarible <T>{
    
    private static int count;
    
    public GenricStaticVarible() {
	count++;
    }
    public static int getCount() {
	return count;
    }
    
    public static void main(String[] args) {
	
	
	GenricStaticVarible<Integer> inVarible= new GenricStaticVarible<>();
	System.out.println(inVarible.getCount());
	
	GenricStaticVarible<Integer> inVarible2= new GenricStaticVarible<>();
	System.out.println(inVarible2.getCount());
	

    }

}
