package StreamApiExample;
public class Animal implements Moveable{
	public static int sum=80;
	 final int i;
	 Animal(int x, int y) 
	    { 
	      
	        i = x; 
	    } 
	 
	 
	public void move(){
	    sum=30;
	   
	   
        System.out.println("I am running"+sum);
    }
	
	public static void main(String[] args){
	  
        Animal tiger = new Animal(10, 10);
        
        tiger.move();
        sum=90;
        System.out.println("I am running main "+sum);
    }
}
 
interface Moveable {
	default void move(){
       System.out.println("I am moving");
   }
}
