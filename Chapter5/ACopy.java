// Use length variable to help copy an array. 
public class ACopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i ;
		
	//	int nums1[], nums2[] = new int[10];
		
		int nums1[] = new int[10];
		int nums2[] = new int[10];
		
		for(i= 0 ; i < nums1.length ; i++)
			nums1[i] = i;
		
		// copy nums1 to nums2 and confirm that nums2 is large enough to hold the contents of nums1.
		if(nums2.length >= nums1.length)       // Use length to compare array sizes.
			for(i= 0; i < nums1.length ; i++)
				nums2[i] = nums1[i];
		
		for(i = 0; i < nums2.length; i++)
			System.out.print( nums2[i] + " ");
	}

}
