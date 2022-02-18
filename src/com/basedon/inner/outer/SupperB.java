package com.basedon.inner.outer;

public class SupperB extends SupperA{

    static {
	
	int b=new SupperA().b=90;
	System.out.println("parent"+b);
    }
    
    public static void main(String[] args) {
	System.out.println("main");
    }
}
