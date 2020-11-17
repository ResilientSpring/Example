// Array.length has nothing to do with the number of elements that are actually in use. 
// It contains the number of elements that the array is capable of holding. 
// Reference: the textbook page on 173. 

// In initialized member variables have their default values, which are zero, null, and false, for numeric types,
// reference types, and booleans, respectively.

public class Array_size_null_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = new int[10];
		
		for (int i = 0; i < (array1.length)/2; i++) {
			
			array1[i] = (array1.length) * 10;
			
		}
		
		
		System.out.print("Elements of array1 are: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print( array1[i] + " ");			
		}

	}

}
