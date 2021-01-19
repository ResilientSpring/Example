// Demonstrate method overloading
class Overload{
	
	void ovlDemo() {   // First version
		System.out.println("No parameter");
	}
	
	// Overload ovlDemo for one integer parameter.
	void ovlDemo(int a) {    // Second version
		System.out.println("One parameter: " + a);
	}
	
	// Overload ovlDemo for two integer parameters. 
	int ovlDemo(int a, int b) {      // third version 
		
		System.out.println("Two parameters: " + a + " " + b);
		
		return a+b;
		
	}
	
	// Overload ovlDemo for two double parameters. 
	double ovlDemo(double a, double b) {   // Fourth version 
		
		System.out.println("Two double parameters: " + a + " " + b);
		
		return a + b;
		
	}
}

public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload obOverload = new Overload();
		int resI;
		double resD;
		
		// Call all versions of ovlDemo()
		obOverload.ovlDemo();
		
		System.out.println();
		
		obOverload.ovlDemo(2);
		
		System.out.println();
		
		resI = obOverload.ovlDemo(4, 6);
		
		System.out.println("Result of obOverload.ovlDemo(4, 6): " + resI);
		
		System.out.println();
		
		resD = obOverload.ovlDemo(1.1, 2.32);
		
		System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);	

	}

}
