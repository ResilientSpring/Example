import com.sun.net.httpserver.Authenticator.Result;

public class Self_Test_No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		
		String string[] = {"Sort", "an", "array", "of", "strings."};
		
		int a, b, t, size;
		
		int c, d, u, size2, sum;
		
		size = 10; // number of elements.
		
		size2 = 5;
		
		// Display original array 
		System.out.print("Original array is: ");
		for (int i = 0; i < size; i++) System.out.print(" " + nums[i]);
		System.out.println();
		
		System.out.print("Original array of strings is: ");
		for (int i = 0; i < string.length; i++) System.out.print(" " + string[i]);
		System.out.println();
		
		// This is the Bubble sort. 
		for(a = 1; a < size; a++) 
			for (b = size-1; b >= a; b--) {
				
				if ( nums[b-1] > nums[b] ) {  // if out of order
					// exchange elements
					
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
				
			}
		
		for ( c = 0; c < size2; c++) {
			for (int i = 0; i < string.length && i != 4; i++) {
				
				int result = string[i].compareTo(string[i+1]);
				
				if (result < 0) {
					
					String holdingString = new String(string[i+1]);
					String holdingString2 = new String(string[i]);
					
					String holdString = string[i+1];
					String holdString2 = string[i];
					
					string[i+1] = string[i];
					string[i] = holdingString;
					
				}
			}
		}
		
		// display sorted array.
		System.out.print("Sorted array is: ");
		
		for (int i = 0; i < size; i++) {
			System.out.print(" " + nums[i]);
		}
		
		System.out.println();
		
		System.out.print("Sorted array of strings is: ");
		for (String string2 : string) {
			System.out.print(string2 + " ");
			
		}

	}

}
