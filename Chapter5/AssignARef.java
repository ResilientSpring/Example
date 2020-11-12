// Assigning array reference variable.

public class AssignARef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		int[] nums1 = new int[10];
		int[] nums2 = new int[10];
		
		for(i= 0; i < 10 ; i++)
			nums1[i] = i;
		
		for(i = 0; i < 10; i++)
			nums2[i] = -i;
		
	System.out.print("Here is numsl: ");
	for(i=0; i < 10; i++)
		System.out.print(nums1[i] + " " );
	System.out.println();
	
	System.out.print("Here is nums2: ");
	for(i = 0; i < 10 ; i++)
		System.out.print(nums2[i] + " ");
	System.out.println();
	
	nums2 = nums1; // Now nums2 and nums1 hold the same memory address that refers to the identical array.
	
	System.out.print("Here is nums2 after assignment: ");
	for(i=0 ; i < 10; i++)
		System.out.print(nums2[i] + " ");
	System.out.println();

	}

}
