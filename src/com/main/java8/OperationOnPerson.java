package com.main.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class OperationOnPerson {
    
	
    
  public static List<Person> createPersion(){
      return Arrays.asList(
	       new  Person(1, "khalid", "M", 33, "Active", 101),
	       new  Person(2, "Sameeha", "F", 1, "Active", 102),
	       new  Person(3, "Sadia", "F", 31, "InActive", 101),
	       new  Person(4, "Ebbadur", "M", 7, "Active", 102),
	       new  Person(5, "Nadim", "M", 32, "InActive", 104),
	       new  Person(6, "Arasahd", "M", 54, "Active", 103),
	       new  Person(7, "Hemchnd", "M", 78, "Active", 104),
	       new  Person(8, "Majabee","F", 19, "InActive", 103)
	     );
  }
  
  
  public static void main(String[] args) {
    
      List<Person> people=createPersion();
      for (Person person : people) {
	person.getAge();
    }
      // create a Map with name and age  as Key and the person as value
     // Map<String, Person> map =
      
     /* int  k=1222;
    System.out.println(Stream.iterate(k, e -> e+1)
	    		      .filter(e ->e%2==0)
	    		     .map(e -> Math.sqrt(e)>20)
	    		    );*/
     // Collections.synchronizedList(people);
      String str=createPersion().stream()
	      				//.parallel()	
	      				.filter(p -> p.getGender()=="M")
	      				.filter(p -> p.getAge()>18)
	      				.map(Person::getName)
	      				.map(String::toUpperCase)
	      				.findAny().orElse("Not fount");
      System.out.println(str);
      
      // Print the list of  person  groupBy DepId 
      Map<Integer, List<Person>>personByDept=createPersion().stream().collect(Collectors.groupingBy(Person::getDepId, Collectors.toList()));
      personByDept.entrySet().forEach(person->{
	  System.out.println(person.getKey()+"---PersonList---"+person.getValue());
      }); 
   // Print the list of  person  count based on  DepId  
      Map<Integer, Long> personByDeptCount=createPersion().stream().collect(Collectors.groupingBy(Person::getDepId, Collectors.counting()));
      personByDeptCount.entrySet().forEach(person->{
	  System.out.println(person.getKey()+"---PersonList---"+person.getValue());
      }); 
      // Print Person who have maximum and minimum Age
     Person maxAge= createPersion().stream().max(Comparator.comparing(Person::getAge)).get();
     Person minAge= createPersion().stream().min(Comparator.comparing(Person::getAge)).get();
     System.out.println("MaxAge:"+ maxAge+"MinAge:" +minAge);
     
     // Print the person who age have maximum w.r.t DepId
     Map<Integer, Optional<Person>>maxAgeByDept=createPersion().stream().collect(Collectors.groupingBy(Person::getDepId,
	        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Person::getAge)))));
     maxAgeByDept.entrySet().forEach(person->{
  	  System.out.println("DepId: "+person.getKey()+"---PersonList-Age--"+person.getValue());
        }); 
     
     
     List<Person> duplicates = createPersion().stream().collect(Collectors.groupingBy(Person::getId)).entrySet().stream()
		.filter(e -> e.getValue().size() > 1).flatMap(e -> e.getValue().stream()).collect(Collectors.toList());
     
     System.out.println("Duplicate Person" +duplicates);
     
     String multilineString = "Baeldung helps \n \n developers \n explore Java.";
     List<String> lines = multilineString.lines()
       .filter(line -> !line.isBlank())
       .map(String::strip)
       .collect(Collectors.toList());
     
    
}
   
  

}
