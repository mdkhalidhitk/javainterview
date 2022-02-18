package com.desgined.pattern;

public class SingletonClass {

    private static final SingletonClass SINGLE_INSTANCE = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
	return SINGLE_INSTANCE;
    }
}
