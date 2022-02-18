package com.genric.exmple;

public class GenricSample1 {
    
    
   public static void main(String[] args) {
       
       
       Mygenric<Integer> list= new Mygenric();
       list.Add(1);
       list.Add(1);
    
}

}


class Mygenric<T>{
    
    public  void Add( T element) {
	 
	System.out.println("Adding");
	   
	   
    }
    
    
}