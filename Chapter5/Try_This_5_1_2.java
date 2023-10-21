
public class Try_This_5_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		
		System.out.print("Original array is: ");
		
		for (int i = 0; i < nums.length; i++) 
			System.out.print(" " + nums[i]);
		System.out.println();
		
		// This is the bubble sort.
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j >= i ; j--) {
				
				if (nums[j-1] > nums[j]) {									
					int k = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = k;
				}
			}
		}
		
		System.out.print("Sorted array is: ");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(" " + nums[i]);
		}

	}

}
