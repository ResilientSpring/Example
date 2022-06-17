package Cpp;

import java.io.IOException;

public class Array_of_strings_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
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
		
		String convertionString = String.valueOf(word);
		
		System.out.println(convertionString);
		
		StringBuilder sBuilder = new StringBuilder();
		for (byte b : word) 
			sBuilder.append((char) b);
		
		System.out.println(sBuilder);
		
		System.out.println(sBuilder.toString());
		
		for (int i = 0; i < dictionary.length; i++) {
			if(sBuilder.toString().equals(dictionary[i][0]))
				System.out.println(dictionary[i][1]);
			
			if(i == dictionary.length -1)
				System.out.println(sBuilder.toString() + " not found!");
		}
	}

}
