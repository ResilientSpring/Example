import java.io.IOException;

public class Guess10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char ch, ignore, answer = 'K';
		
		do {
			System.out.println("I'm thinking of a letter between A and Z. ");
			System.out.print("Can you guess it: ");

			// read a character
			ch = (char) System.in.read();

			if (ch == answer)
				System.out.println("** Right **");
			else {
				System.out.print("...Sorry, you're ");
				if (ch < answer)
					System.out.println("too low");
				else
					System.out.println("too high");
				System.out.println("Try again!\n");

			}

		} while (answer != ch);

	}

}
