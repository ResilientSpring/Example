// Demonstrate block scope. 
public class ScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x; // Known to all code within main
		
		x = 10; 
		if (x == 10) { // start new scope. 
			
			int y = 20; // Known only to this block
			
			// x and y both known here. 
			
			System.out.println("x and y: " + x + " " + y);
			x = y*2; 
		}
		// y = 100; // Error! y not known here because, here, y is outside of its scope. 
		
		// x is still known here. 
		System.out.println("x is " + x);

	}

}
