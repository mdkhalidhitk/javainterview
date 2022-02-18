package com.clonable.interfac.pratice;

public class MyCloneClass implements Cloneable {
	
	
	int a; double b; 
	
	MyCloneClass   getClone() {
		
		try {
			
			return (MyCloneClass) super.clone();
		}
		catch(CloneNotSupportedException  e){
			
			
		}
		return this;
		
		
		
		
	}
	

}
