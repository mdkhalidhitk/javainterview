package com.genric.exmple;

import java.util.ArrayList;
import java.util.List;

import com.main.java8.FroukJoinPool;

public class MyFruitGenric {
    
    
    public static <T> void copy(List<T> src , List<? super T >target){
	
	for (T t : src) {
	    target.add(t);
	    
	}
	System.out.println(target.size());
}
    
    public static void main(String[] args) {
	Orange orange= new Orange();
	Banana banana= new Banana();
	List<Banana> fruit= new ArrayList<>();
	
	//fruit.add(orange);
	fruit.add(banana);
	List<Fruit> fruit2= new ArrayList<>();
	copy(fruit, fruit2);
    }

}
