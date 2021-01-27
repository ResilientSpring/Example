import java.util.Scanner;

class Factorial3 {   // The factorial of five (5 x 4 x 3 x 2 x 1) is 120. Four factorial (4 x 3 x 2 x 1) is 24.
	
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

public class Recursion3 {

	public static void main(String[] args) {
		
		int input, result, result2;
		
		System.out.println("Enter the number to count its factorial: ");
		
		Scanner readScanner = new Scanner(System.in);
		input = readScanner.nextInt();
		readScanner.close();
		
		System.out.println("Your input is " + input);
		
		Factorial3 factorial3 = new Factorial3();
		result = factorial3.factR(input);
		
		System.out.println("The factorial of " + input + " is " + result + " , using recursive function.");
		
		result = factorial3.factI(input);
		System.out.println("The factorial of " + input + " is " + result + " , using iterative function.");

	}

}
