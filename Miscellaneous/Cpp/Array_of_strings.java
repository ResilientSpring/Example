package Cpp;

import java.io.IOException;

public class Array_of_strings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String dictionary[][] = { { "Pencil", "A written instrument." }, { "Keyboard", "An input device." },
				{ "rifle", "A shoulder-fired firearm." }, { "Airplane", "A fixed-wing aircraft." },
				{ "network", "An interconnected group of computers." } };

		byte[] word = new byte[80];

		System.out.println("Enter word: ");
		System.in.read(word);
		System.out.println("You entered: ");
		for (int i = 0; i < word.length; i++)
			System.out.print((char) word[i]);
		
		System.out.println(word.toString());
		
		for (int i = 0; i < word.length; i++) {
			if(word.toString().equals(dictionary[i][0]))
				System.out.println(dictionary[i][1]);
		}

	}

}
