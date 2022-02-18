package com.genric.exmple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class GenricMainMethod {

    
    
   public static final List<Message> message=Arrays.asList(new EmailMessage("Hello khalid"),
	    new TextMessage("Hello Hassan"));
    public static final List<EmailMessage> emmailMessage=Arrays.asList(new EmailMessage("Hello Email Message"));
    public static final List<TextMessage> textMessage=Arrays.asList(new TextMessage("Hello TextMessage"));
    public static void main(String[] args) {
	
	ArrayList num =  new ArrayList<>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(1);
	int total=0;
	
	for (Object object : num) {
	    
	    total+=(Integer)object;
	    
	}
	System.out.println(total);
	
	//  For Single glass
	//log(new EmailMessage("Hello !!!!!!!!"));
	
	// Arrays Object
	EmailMessage[] emailArrays= {new EmailMessage("Hello!!! Email Arays"), new EmailMessage("Hello !! Arrays 2")};
	//logAll(emailArrays);
	
	// Arrays Assingment
	Message[] messages=emailArrays;
	//logAll(messages);
	
	// It will cause Arys.lang.ArrsaysStroeException
	//messages[0] = new TextMessage("text Messsage!!!");
	// List aren't convariant 
	// List will printe Message Class type not Child class type 
	// for that reastions genric Concept came in java
	//logAll(message); // Only Same class type
	
	// we will generic Way  Using lamida 
	//Consumer<Message> con=  t -> {System.out.println(t);};
	// Method refrences 
	//Super type
	Consumer<Object> consumer=System.out::println;
	logAll(emmailMessage,consumer);
    }
    
    static void log(Message message) {
	System.out.println(message);
    }
    
    static void logAll(Message[] messages) {
	for (Message mess:messages) {
	   System.out.println("one by one From Array:"+ mess); 
	}
    }
    // This will return  list object   Message Class and sub class  ,Thats mean's which class  extends  generic property
    // Super Commonly use for Function Enterface; ? Stands for  Means Wild card Symbole 
    // For Exmpale : Coparator <Foo> 
    //always Compartor<? Extends Foo>
    // Comparator <Message> <:  comparator <?  Super EmailMessage> >  
    static void  logAll(List< ? extends Message> message, Consumer< ? super Message> consumer) {
	    
	for (Message mess:message) {
		   consumer.accept(mess); 
		}    
	    
	    
    }
    
    
}
