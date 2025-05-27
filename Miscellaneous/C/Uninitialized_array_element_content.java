package C;

public class Uninitialized_array_element_content {

	public static void main(String[] args) {
		
		final int ALL_INPUT_LINES_LONGER_THAN_EIGHTY = 500; 
		
		char more_than_80_characters[] = new char[ALL_INPUT_LINES_LONGER_THAN_EIGHTY];
		
		if(more_than_80_characters[0] == 0)
			System.out.println("more_than_80_characters[0] is 0\n");
		else 
			
			System.out.println("more_than_80_characters[0] is " + more_than_80_characters[0]);
		

	}

}
