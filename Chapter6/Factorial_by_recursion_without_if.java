import java.util.Scanner;

public class Factorial_by_recursion_without_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input, result;
		
		System.out.println("Enter the number to count its factorial: ");
		
		Scanner readScanner = new Scanner(System.in);
		input = readScanner.nextInt();
		readScanner.close();
		
		System.out.println("Your input is " + input);
		
		result = factR(input);
		
		System.out.println("The factorial of " + input + " is " + result + ", using recursive function.");
	}
	
	static int factR(int n){
		int intermediate_goods, result; 
		
		// Execute the recursive call to factR().
		intermediate_goods = factR(n-1) ; // The factorial of a number n is n*n-1 *n-2*... *1.
		
		result = intermediate_goods * n;
		
		return result;
	}

}
