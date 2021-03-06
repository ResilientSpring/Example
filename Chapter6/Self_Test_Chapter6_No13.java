import java.util.Scanner;

/*
 * Create a varargs method called sum() that sums the int values passed to it.
 * */

public class Self_Test_Chapter6_No13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] collection = new int[10];
		
		System.out.print("Please enter 10 integers for the program to find the sum of them.\n");
		
		for (int i = 0; i < collection.length; i++) {
			
			switch (i) {
			case 0: {
				System.out.println("Now, insert the first integer: ");
				Scanner myScanner = new Scanner(System.in);
				collection[0] = myScanner.nextInt();
//				myScanner.close();    
/* 
 * What does scanner.close() do? 
 *
 * "Yes, it does mean that System.in will be closed. 
 * Once closed, you won't be able to use System.in for the rest of your program. 
 * In most cases you won't want to close System.in, so you won't want to call .close() in that case."
 * 
 * Reference: https://stackoverflow.com/questions/26245468/what-does-scanner-close-do */
				break;
			}
			
			default:
				System.out.println("Now, insert the No." + (i + 1) + " value.");
				Scanner myScanner = new Scanner(System.in);
				collection[i] = myScanner.nextInt();
			}
		}
		
		sums(collection);
	}
	

	static void sums(int ... v) {
		
		int summation = 0;
		
		int[] orthodoxy = new int[v.length];
		
		for (int i = 0; i < orthodoxy.length; i++) {
			
			orthodoxy[i] = v[i];
		}
		
		for (int i = 0; i < orthodoxy.length; i++) {
			summation += orthodoxy[i]; 
		}
		
		System.out.println("The sum of the 10 integers you entered is " + summation);
		
	}

}
