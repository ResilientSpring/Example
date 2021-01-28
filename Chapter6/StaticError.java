
public class StaticError {
	
	int denom = 3;           // A normal instance variable
	static int val = 1024;   // A static variable
	
	/* Error! Can't access a non-static variable from within a static method. */	
	static int valDivDenom() {
		return val/denom;  // won't compile!
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("StaticError.valDivDenom = " + StaticError.valDivDenom());

	}

}
