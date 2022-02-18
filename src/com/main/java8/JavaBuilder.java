package com.main.java8;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaBuilder {

	public static void main(String[] args) {
		Child child = Child.builder()
				  .parentName("Andrea")
				  .parentAge(38)
				  .childName("Emma")
				  .childAge(6)
				  .build();
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		pq.add(11);
		pq.add(10);
		pq.add(22);
		pq.add(5);
		pq.add(12);
		pq.add(2);
		
		while(pq.isEmpty()==false) {
			//System.out.printf("%d", pq.remove());
			//System.out.println("\n");
		}
		
		
		Queue<Integer> pq1
        = new LinkedList<Integer>();
		pq1.add(11);
		pq1.add(10);
		pq1.add(22);
		pq1.add(5);
		pq1.add(12);
		pq1.add(2);
		System.out.println("\n----------------");
		System.out.println("\n"+pq1);
//		while(pq1.isEmpty()==false) {
//			System.out.printf("%d", pq1.remove());
//			System.out.println("\n");
//		}
		
		
	}
}
