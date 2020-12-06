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
		
		// Use for-each for loop to display and sum the values.
		for (int[] x : nums) {   // Notice how x is declared.
			for (int y : x) {
				
			}
		}

	}

}
