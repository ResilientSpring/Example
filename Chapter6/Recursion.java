// A single example of recursion. 

class Factorial {   // The factorial of five (5 x 4 x 3 x 2 x 1) is 120. Four factorial (4 x 3 x 2 x 1) is 24.
	
	// This is a recursive function. 	
	int factR(int n){
		int result; 
		
		if(n == 1) return 1;
		
		// Execute the recursive call to factR().
		result = factR(n-1) * n; // The factorial of a number n is n*n-1 *n-2*... *1.
		return result;
	}
	
	// This is an iterative equivalent. 
	int factI(int n) {
		int t, result;
		
		result = 1; 
		for(t = 1 ; t <= n ; t++) result *= t ;
		return result;
	}
}

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial factorial = new Factorial();
		
		System.out.println("Factorials using recursive method.");
		System.out.println("Factorial of 3 is " + factorial.factR(3));
		System.out.println("Factorial of 4 is " + factorial.factR(4));
		System.out.println("Factorial of 5 is " + factorial.factR(5));
		System.out.println();
		
		System.out.println("Factorials using iterative method.");
		System.out.println("Factorial of 3 is " + factorial.factI(3));
		System.out.println("Factorial of 4 is " + factorial.factI(4));
		System.out.println("Factorial of 5 is " + factorial.factI(5));
		

	}

}
