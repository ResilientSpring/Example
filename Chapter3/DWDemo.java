// Demonstrate the do-while loop.
public class DWDemo {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		
		char ch;
		
		do {
			System.out.print("Press a key followed by ENTER: ");
			ch = (char) System.in.read(); // get a char
		} while (ch != 'q');

	}

}
