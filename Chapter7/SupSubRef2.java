// A superclass reference can refer to a subclass object. 

class X3 {
	int a;
	
	public X3(int i) {
		// TODO Auto-generated constructor stub
		
		a = i;
	}
}

class Y3 extends X3 {
	int b;
	
	public Y3(int i, int j) {
		// TODO Auto-generated constructor stub
		super(j);
		b = i;
	}
}

public class SupSubRef2 {

	public static void main(String[] args) {
		
		X3 x = new X3(10);
		Y3 y = new Y3(5, 6);
		
		System.out.println("X.a: " + x.a);
		
		x = y; 
		System.out.println("X.a: " + x.a);
		
		// X references know only about X members
		x.a = 19;  // OK
// 		x2.b = 27;  // Error, X does not have a b member. 

	}

}
