// To see if we can create a infinite for loop by simply leaving the condition empty.

import java.io.IOException;

// 
public class Break2b {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char ignore;
		
		for (char ch = 35; ; ch++) {
			
			System.out.println("I am guessing a character between a and z.");
			System.out.print("Can you guess it?");
			
			char ch2  = (char) System.in.read();
			
			// discard any other characters in the input buffer
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			
			if (ch2 == 'q' )  {
				System.out.println("You pressed q and ch is currently " + ch );
				
				break;
			}
		}

	}

}
