// Rewrite the MinMax class shown earlier in this chapter so that it uses a for-each style for loop.
public class Self_Test_No13 {

	public static void main(String[] args) {
		
		int nums[] = new int[10];
		int min, max;
		
		nums[0] = 99;
		nums[1] = -10;
		nums[2] = 100123;
		nums[3] = 18;
		nums[4] = -978;
		nums[5] = 5623;
		nums[6] = 463;
		nums[7] = -9;
		nums[8] = 287;
		nums[9] = 49;
		min = max = nums[0];  // Set min and max to nums[0]
		
		for (int i : nums) {
			if(i < min) min = i;
			if(i > max) max= i;
		}
	
		/*
		for (int i = 1; i < 10; i++) {
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		*/
		System.out.println("min and max: " + min + ", " + max);

	}

}
