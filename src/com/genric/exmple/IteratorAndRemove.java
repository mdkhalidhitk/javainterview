package com.genric.exmple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class IteratorAndRemove {
    public static void main(String[] args) {
	
	List<String > name=new ArrayList<>();
	
		name.add("khalid");
		name.add("hassan");
	name.forEach(System.out::println);
	/* Optional<String> str=
	name.stream()
	    .filter(ch -> Character.isLowerCase(ch.charAt(0)))
	    .map(ch -> ch.replace("khalid", "md")).findFirst();
	if(str.isPresent()) {
	    System.out.println(str);
	} */
	// For loop
	
	/*for (String string : name) {
	    if(Character.isLowerCase(string.charAt(0))) {
		
		name.remove(string);
	    }
	} */
	/*for (Iterator<String> iterator = name.iterator(); iterator.hasNext();) {
	    String string = iterator.next();
	    
if(Character.isLowerCase(string.charAt(0))) {
		
    iterator.remove();
	    }
	    
	    
	    
	}*/
	// java8 feture
	
	name.removeIf(ch-> Character.isLowerCase(ch.charAt(0)));
	    System.out.println(name);
	
	
	
	
	
	
    }
    
    
    
    

}
