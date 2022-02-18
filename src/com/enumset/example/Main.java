package com.enumset.example;

public class Main {

	public static void main(String[] args) {
		MySize[] sizes = MySize.values();
		for (MySize s : sizes) {
			System.out.println(s);
		}
	}
}
