/*
 * Automatic type conversion can affect overloaded method resolution. 
 */

class Overload2{
	void f(int x) {
		System.out.println("Inside f(int): " + x);
	}
	
	void f(double x) {
		System.out.println("Inside f(double): " + x);
	}
}

public class TypeConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload2 obOverload2 = new Overload2();
		
		int i = 10;
		double d = 10.1;
		
		byte b = 99;
		short s = 10;
		float f = 11.5F;
		
		obOverload2.f(i);  // calls ob,f(int)
		obOverload2.f(d);  // calls ob.f(double)
		
		obOverload2.f(b);  // calls ob,f(int) - type conversion 
		obOverload2.f(s);  // calls ob.f(int) - type conversion
		obOverload2.f(f);  // calls ob.f(double) - type conversion	

	}

}
