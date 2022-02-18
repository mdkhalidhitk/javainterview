package com.genric.exmple;

import java.io.Serializable;

public class GenricSample2 {

    public static <T extends Comparable<T>& Serializable> void  use(T t1 ,T t2){
	System.out.println("khalid ");
	
	
	
    }
    public static void main(String[] args) {
	use(1, 2);
    }
    
    
}
