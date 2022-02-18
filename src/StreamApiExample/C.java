package StreamApiExample;

public class C  extends  MyAbstract{

    int a;
  static  void myMethod() {
	System.out.println("myMethod");
    }
  
  static {
	System.out.println("static block C classe");
	
    }
  
  {  
      System.out.println("C class IIB block"); 
  }
  
  public static void foo(int a) { 
      System.out.println("Test.foo() called "); 
  } 
  public static void foo() {  
      System.out.println("Test.foo(int) called "); 
  } 
  
  
     public static void main(String[] args) {
	 C c= new C();
	 c.add();
	 System.out.println(c.a=10);
	 c.myMethod();
	 
	 String x = "Hello " + "World!";

	 x.intern();
	 System.out.println( x.intern());

    }
}
