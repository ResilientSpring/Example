// Use for-each style for on a two-dimensional array.
public class ForEach3 {

	public static void main(String[] args) {
		int sum = 0;
		int nums[][] = new int[3][5];
		
		// give nums some values
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < 5; j++) {
				nums[i][j] = (i + 1) * (j + 1);
			}
		}
		
		System.out.print("The elements of nums[][] are: " );
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print( nums[i][j] + " ");
			}
		}
		
		System.out.println();
		
	/* The "for-each style for" automatically cycles through the entire array. obtaining one element at a time,
	 *  in sequence, from beginning (the lowest index) to end (the highest index).      Textbook page 180. 
	 * */	
		
		// Use for-each for loop to display and sum the values.
		for (int[] x : nums) {   // Notice how x is declared.
			
			// This operation is now identical to that in For_each.java that obtains the elements from an one-dimensional array.
			for (int y : x) {  
				System.out.println("Value is: " + y);
				sum += y;
			}
			
		}
		
		System.out.println("Summation: " + sum);

	}

}
