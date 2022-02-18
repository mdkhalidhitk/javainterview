package com.main.java8;

public class MyClass {

}

class My implements A, B {

    @Override
    public void add() {

    }

    @Override
    public int Subtarct(int a, int b) {
	// TODO Auto-generated method stub
	int result = B.super.Subtarct(a, b);
	return result;
    }

    int result = A.SubAdd(23, 98);

    int resultB = B.SubAdd(23, 98);
    int defaultA = Subtarct1(23, 98);

}

@FunctionalInterface
interface A {

    public void add();

    default int Subtarct1(int a, int b) {
	return a * b;

    }

    static int SubAdd(int a, int b) {
	return a + b;

    }

}

@FunctionalInterface
interface B {

    public void add();

    default int Subtarct(int a, int b) {
	return a - b;

    }

    static int SubAdd(int a, int b) {
	return a + b;

    }

}