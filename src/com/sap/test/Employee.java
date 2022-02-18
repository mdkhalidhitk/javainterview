package com.sap.test;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private int age;

    Employee(String name, int age) {
	this.name = name;
	this.age = age;
    }

    @Override
    public int hashCode() {

	return 1;
    }

    @Override
    public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return true;
    }

    public static void main(String[] args) {

	Employee e1 = new Employee("a", 1);
	Employee e2 = new Employee("b", 2);
	Employee e3 = new Employee("c", 9);

	Map<Employee, String> map = new HashMap<Employee, String>();
	map.put(e1, "a");
	map.put(e2, "b");
	map.put(e3, "d");
	System.out.println(map.get(e1));
	
    }

}
