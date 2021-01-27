import java.io.IOException;

class Factorial2 {   // The factorial of five (5 x 4 x 3 x 2 x 1) is 120. Four factorial (4 x 3 x 2 x 1) is 24.
	
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

public class Recursion2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int i, result, result2;
		char input;
		
		System.out.println("Enter the number to count its factorial: ");
		i = System.in.read();  // why I type '9', but it returns 57 ? See: https://stackoverflow.com/a/34120618/14900011 
		
		System.out.println("Your input is " + i);
		
		Factorial2 factorial2 = new Factorial2();
		
		result = factorial2.factR(i);
		result2 = factorial2.factI(i);
		
		System.out.println("The factorial of " + i + " is " + result + " , using recursive function.");
		System.out.println("The factorial of " + i + " is " + result2 + " , using iterative function.");
		
		System.out.println(factorial2.factR(51));
		System.out.println(factorial2.factR(5));

	}

}
