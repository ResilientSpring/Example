package C;

public class Uninitialized_array_element_content {

	public static void main(String[] args) {
		
		final int ALL_INPUT_LINES_LONGER_THAN_EIGHTY = 500; 
		
		char more_than_80_characters[] = new char[ALL_INPUT_LINES_LONGER_THAN_EIGHTY];
		
		if(more_than_80_characters[0] == 0)
			System.out.println("Look! more_than_80_characters[0] is 0");
		else 
			
			System.out.println("See! more_than_80_characters[0] is " + more_than_80_characters[0]);
		

	}

}

// Adapted from https://github.com/ResilientSpring/The-C-Programming-Language/blob/main/Blend/Uninitialized%20array%20element's%20content%202/bruise%203.c

// Important Note: https://chatgpt.com/c/68349761-6ad8-8008-8673-728152e81f3a