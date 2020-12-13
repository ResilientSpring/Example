
public class Self_Test_No6_2 {

	public static void main(String[] args) {
		
		String[] arrayOfstrings = {"I", "like", "Java", "."};
		
		System.out.println("The length of the array of arrayOfstrings is: " + arrayOfstrings.length);
	//	System.out.println("The 8th character of arrayOfstrings is: " + arrayOfstrings.charAt());
		System.out.println("The second element of the array of arrayOfstrings is: " + arrayOfstrings[1]);
		
		String[] arrayOfStrings2;
	//	arrayOfstrings2 = new String();
		arrayOfStrings2 = new String[8];
		
		arrayOfStrings2[0] = "I";
		arrayOfStrings2[1] = "favour";
		arrayOfStrings2[2] = "Objective";
		arrayOfStrings2[3] = "C";
		arrayOfStrings2[4] = "over";
		arrayOfStrings2[5] = "non-objective";
		arrayOfStrings2[6] = "C programming language.";
		
		System.out.println("The length of the array of arrayOfStrings2 is: " + arrayOfStrings2.length);
		System.out.println("The third element of the array of arrayOfstring is: " + arrayOfStrings2[2]);
		System.out.println("The eighth element of the array of arrayOfstring2 is: " + arrayOfStrings2[7]);

	}

}
