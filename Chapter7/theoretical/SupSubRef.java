package theoretical;

//A superclass reference can refer to a subclass object. 

class X2 {
	int a;
	
	public X2(int i) {
		// TODO Auto-generated constructor stub
		
		a = i;
	}
}

class Y2 extends X2 {
	int b;
	
	public Y2(int i, int j) {
		// TODO Auto-generated constructor stub
		super(j);
		b = i;
	}
}

public class SupSubRef {

	public static void main(String[] args) {
		
		X2 x = new X2(10);
		X2 x2;
		Y2 y = new Y2(5, 6);
		
		x2 = x; // OK, both of same type.
		System.out.println("X2.a: " + x2.a);
		System.out.println("x.a: " + x.a);
		
		x2 = y;  // still ok because Y2 is derived from X2. Both of somewhat same type.
		System.out.println("X2.a: " + x2.a);
		
		// X references know only about X members
		x2.a = 19;  // OK
// 		x2.b = 27;  // Error, X does not have a b member. 

		
	}

}
