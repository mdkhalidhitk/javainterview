package com.inheritance.practice;

public interface MyinterfaceClass {
void show();
void showMycharcter();

static void showme() {
    
    System.out.println("static void showme() Interface");
}

default void addnumber(int a,int b) {
    
    int result=a+b;
    System.out.println("result"+result);
    
    
}



}
