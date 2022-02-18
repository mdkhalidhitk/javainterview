package com.sap.test;

public  class Hello {

    
    
    void display() {
	 
	 System.out.println("Outer class");
	 
	 
    }
  
    
    private static class Hello1{
	     
	     void display() {
		 
		
		 
	     }
    }
    
    
    public static void main(String[] args) {
  	System.out.println();
  	Hello.Hello1 h1= new Hello.Hello1();
  	h1.display();
  	new Hello().display();
      }
    
    
    
}

 