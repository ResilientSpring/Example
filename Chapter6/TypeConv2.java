/*
 * In the context of method overload in Java, 
 * automatic type conversions apply only if there is no direct match between a parameter and an argument. 
 * 
 * Textbook page on 226
 * 
 * */

class Overload3{
	
	void f(byte x) {
		System.out.println("Inside f(byte): " + x);
	}
	
	void f(int x) {
		System.out.println("Inside f(int): " + x);
	}
	
	void f(double x) {
		System.out.println("Inside f(double): " + x);
	}
}

public class TypeConv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload3 obOverload3 = new Overload3();
		
		int i = 10;
		double d = 10.1;
		
		byte b = 99;
		short s = 10;
		float f = 11.5F;
		
		obOverload3.f(i);  // calls ob,f(int)
		obOverload3.f(d);  // calls ob.f(double)
		
		obOverload3.f(b);  // now, no type conversion 
		
		obOverload3.f(s);  // calls ob.f(int) - type conversion
		obOverload3.f(f);  // calls ob.f(double) - type conversion	

	}

}
