package com.main.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

public class Java8Feture {

	public static void main(String[] args) {
		khalid f1 = (a, b) -> {
			System.out.println(a + b);
			return b;

		};
		f1.add(6, 9);

		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "mkyong.com", 1));
		
		 final Map hashMap = new HashMap<>();
		
		 Map<Integer, Hosting> map = list.stream()
			      .collect(Collectors.toMap(Hosting::getId, Function.identity()));
		// key = id, value - websites
		Map<Integer, String> result1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));

		System.out.println("Result 1 : " + result1);
		
		Map<Integer, Hosting> result = list.stream() .collect(Collectors.toMap(Hosting::getId, h -> h));
		List cards = Arrays.asList("Visa", "MasterCard", "American Express", "Visa"); 
		System.out.println("list: " + cards); 
		Map cards2Length = (Map) cards.stream() .collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1));

	

	}

}

@FunctionalInterface
interface khalid {

	abstract int add(int a, int b);

	default void sub() {

	}
}

@Getter
@Setter
class Hosting {

	private int Id;
	private String name;
	private long websites;

	public Hosting(int id, String name, long websites) {
		Id = id;
		this.name = name;
		this.websites = websites;
	}
}
