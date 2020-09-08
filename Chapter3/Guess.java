import java.io.IOException;

// Guess the letter game.
public class Guess {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		
		char ch, answer ='K';
		
		System.out.println("I am thinking of a letter between A and Z. ");
		System.out.print("Can you guess it: ");
		
		ch = (char) System.in.read(); // read a char from the keyboard
		
		if(ch == answer) System.out.println("** Right **");

	}

}
