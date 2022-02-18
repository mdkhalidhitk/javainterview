package StreamApiExample;

public class B extends A {

	@Override
	void add(int a) {
		
		if(a==0) {
			
			try {
				throw new Exception("null value exeptions");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		A b= new A();
		Float in=67F;
		b.add(in);
	}
	

}
