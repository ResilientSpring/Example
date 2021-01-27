import java.util.Scanner;

public class Multi_dimensional_array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, input;
		int square[][] = { {1, 1}, {2, 4}, {3, 9}, {4, 16}, {5, 25}, {6, 36}, {7, 49}, {8, 56}, {9, 81}, {10, } };
		
		System.out.println("Enter a number between 1 and 10 to see its square number: ");
		Scanner readScanner = new Scanner(System.in);
		input = readScanner.nextInt();
		
		for(i= 0; i < 10 ; i++)
			if(square[i][0] == input) break;
		
		// value of i is kept in the memory even when the for loop has been terminated. 
		System.out.println("The square of " + input + " is " + square[i][1]);

	}

}
