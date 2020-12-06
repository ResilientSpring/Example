// Demonstrate String arrays
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strs[] = { "This", "is", "a", "test." };

		System.out.println("Original array: ");
		for (String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");
		
		// change a string.
		strs[1] = "was";
		strs[3] = "test, too!";
		
		System.out.println("Modified array: ");
		for (String s : strs) 
			System.out.print(s + " ");
	}

}
