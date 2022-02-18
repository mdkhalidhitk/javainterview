package com.enumset.example;

import java.util.EnumSet;

public class MyEnumClass {
    
    public static void main(String[] args) {
	
	EnumSet<khalid> khalid1,khalid2,khalid3,khalid4;
	
	// Adding the elemmts 
	khalid1=EnumSet.of(khalid.CODE,khalid.LEARN,khalid.CONTRIBUTE,khalid.MCQ,khalid.QUIZ);
	
	khalid1.forEach(k -> System.out.println(k));
	
	khalid2 = EnumSet.complementOf(khalid1);
	khalid2.forEach(k -> System.out.println(k));
	khalid3 = EnumSet.allOf(khalid.class);
	khalid3.forEach(k -> System.out.println(k));
	khalid4 = EnumSet.range(khalid.CODE, khalid.CONTRIBUTE);
	khalid4.forEach(k -> System.out.println(k));
	
	
    }

}

enum khalid {
    
    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ 
    
};
