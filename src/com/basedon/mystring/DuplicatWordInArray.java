package com.basedon.mystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DuplicatWordInArray {
    
    public static void main(String[] args) {
	int wrc=1;
    
    String [] words= {"khalid","hassan","md","khalid","HAssan","MD"};
    for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
	{
		for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
		{
			
		if(words[i].equalsIgnoreCase(words[j]))	//Checking for both strings are equal
			{
				wrc=wrc+1;				//if equal increment the count
				words[j]="0";			//Replace repeated words by zero
			}
		}
		if(words[i]!="0")
		System.out.println(words[i]+"--"+wrc);	//Printing the word along with count
		wrc=1;
		
 }  
    
    }

}
