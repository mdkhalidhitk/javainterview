package com.genric.exmple;

import java.util.Arrays;
import java.util.List;

public class MyGenric {
    
    
    public static <T extends Comparable<T>> void copyFromSrcToDis(List<T> source ,List<T> target) {
	
	if(target.get(0).compareTo(source.get(0))==0) {
	    System.out.println("Hello");
	}
	else {
	    System.out.println("By");
	}
 }
    
    public static void main(String[] args) {
	
	List<Integer> source =Arrays.asList(1);
	List<Integer>  target =Arrays.asList(1);
	copyFromSrcToDis(source, target);
    }

}
