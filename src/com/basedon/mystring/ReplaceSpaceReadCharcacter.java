package com.basedon.mystring;

import java.util.ArrayList;
import java.util.List;

public class ReplaceSpaceReadCharcacter {
    
    public static void main(String[] args) {
	
    
    String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
    
    //1. Using replaceAll() Method

    String strWithoutSpace = str.replaceAll("\\s", "");

   // System.out.println(strWithoutSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring
    
    
    // Using method 
    StringBuffer sb= new StringBuffer();
    char[] charcterArray=str.toCharArray();
   
    for(int i=0; i<charcterArray.length; i++) {
	
	if( (charcterArray[i] =='\t') && (!Character.isWhitespace(charcterArray[i]))) {
	    
	    sb.append(charcterArray[i]);
	}
    }
    
    
    
    System.out.println(strWithoutSpace);
    
	    
}

}
