package com.basedon.mystring;

public class ReverseString {
    
    public static void main(String[] args) {
	String myStrin="KhalidHassan";
	StringBuffer str= new StringBuffer(myStrin);
	//System.out.println(str.reverse());
	char[] charArray=myStrin.toCharArray();
	String revser="";
	
for (int i = charArray.length-1; i >=0 ; i--) {
    
    revser=revser+charArray[i];
    
 }
myStrin="hsd";
System.out.println(recursiveMethod(myStrin));

// Using Recursive Method

	
	
	
	
    }
    
  //Recursive method to reverse string
    
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
 
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }

}
