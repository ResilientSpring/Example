// This program will not compile.
public class LtoD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long L;
		double D;
		
		D = 100123285.0; 
		L = D; // Illegal!!! No automatic conversion from double to long because the destination type is NOT larger than the source type. 
		
		System.out.println("L and D: " + L + " " + D);

	}

}
