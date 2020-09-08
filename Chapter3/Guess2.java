// Guess the letter game, 2nd version. 
public class Guess2 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		
		char ch, answer ='K';
		
		System.out.println("I am thinking of a letter between A and Z. ");
		System.out.print("Can you guess it: ");
		
		ch = (char) System.in.read();
		
		if ( ch == answer ) System.out.println("** Right **");
		else System.out.println("...Sorry, you're wrong. ");
		
	}

}
