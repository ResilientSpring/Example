import java.io.IOException;

public class DWDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char ch, ignore;
		
		do {
			System.out.print("Press a key followed by ENTER: ");
			ch = (char) System.in.read(); // get a char
			
			// discard any other characters in the input buffer
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			
		} while (ch != 'q');

	}

}
