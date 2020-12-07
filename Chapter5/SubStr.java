// Use substring().
public class SubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String originalString = "Java makes the Web move.";
		
		// Construct a substring
		String subString = originalString.substring(5, 18); // This creates a new string with desired sub-string.
		
		System.out.println("OriginalString: " + originalString);
		System.out.println("sub-string: " + subString);

	}

}
