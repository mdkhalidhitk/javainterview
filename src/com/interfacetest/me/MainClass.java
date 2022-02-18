package com.interfacetest.me;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
	
	Mytest my= new Ctest();
	System.out.println(my.abc());
	System.out.println(my.toString());
	System.out.println(MainClass.class.getSuperclass());
	System.out.println(Mytest.class.getSuperclass());
	System.out.println(Integer.class.getSuperclass());
	
List<String> list= new ArrayList<>();

list.add("A");
list.add("B");
list.add("c");
System.out.println(
list.removeIf(str -> str.startsWith("A")));
System.out.println(list);

	
	
	
	
    }

}

interface Mytest{
    
    String abc();
}

class Ctest implements Mytest
{
    @Override
    public String abc() {
	// TODO Auto-generated method stub
	return "khalid";
    } 
}