package StreamApiExample;

public abstract class MyAbstract {

    static void add() {
	System.out.println("static");
    }
    static {
	System.out.println("static block MyAbstract");
	
    }
    
    {  
        System.out.println("MyAbstract IIB block"); 
    } 
    //abstract void sum(int a, int b);
    
    
    
}
