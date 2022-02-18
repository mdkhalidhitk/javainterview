package com.main.java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Builder
public class Person {

   private int id;
   private String name;
   private String gender;
   private int age;
   private String status;
   private int depId;


   
   
   
}
