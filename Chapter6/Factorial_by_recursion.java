import java.util.Scanner;

public class Factorial_by_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input;
		
		System.out.println("Enter the number to count its factorial: ");
		
		Scanner readScanner = new Scanner(System.in);
		input = readScanner.nextInt();
		readScanner.close();
		
		System.out.println("Your input is " + input);
		
		System.out.println("The factorial of " + input + " is " + factR(input) + " , using recursive function.");

	}
	
	static int factR(int n){
		int result; 
		
		if(n == 1) return 1;
		
		// Execute the recursive call to factR().
		result = factR(n-1) * n; // The factorial of a number n is n*n-1 *n-2*... *1.
		return result;
	}

}
