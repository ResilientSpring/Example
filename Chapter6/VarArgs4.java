// Varargs, overloading, and ambiguity.
// 
// This program contains an error and will not compile. 
public class VarArgs4 {
	
	// Use an int vararg parameter. 
	static void vaTest(int ... v) {
		/// ...
	}
	
	 // Use a boolean vararg parameter. 
	static void vaTest(boolean ... v ) {
		// ...
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vaTest(1,2,3); // ok
		vaTest(true, false, false); // ok
		
		vaTest();  // Ambiguous!

	}

}
