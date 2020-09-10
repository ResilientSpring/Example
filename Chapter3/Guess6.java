/*
 * Java Scanner class provides nextInt() method for reading an integer value, nextDouble() method for reading a double value, 
 * nextLong() method for reading a long value, etc. 
 * 
 * But there is no nextChar() method in the Scanner class to read a character in Java. 
 * 
 * To read a character in Java, we use next() of the Scanner class method followed by chatAt() at method of the String class.
 * 
 * The next() method returns the next token/ word in the input as a string and chatAt(0) method returns the first character in that string.
 * 
 * Source: https://www.javatpoint.com/how-to-read-character-in-java
 * */

import java.util.Scanner;

public class Guess6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch, answer='K';
		
		System.out.println("I am thinking of a letter between A and Z. ");
		System.out.print("Can you guess it: ");
		
		
		Scanner myObjScanner = new Scanner(System.in);
		ch =   myObjScanner.nextLine().charAt(1);
		
		myObjScanner.close();
		
		if (ch == answer) System.out.print("** Right **");
		else { 
			System.out.print("...Sorry, you're ");
			
			if(ch > answer) System.out.print("too high.");
			else System.out.print("too low.");
		
		}
	}

}
