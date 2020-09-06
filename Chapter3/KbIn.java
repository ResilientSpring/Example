// Read a character from the keyboard. 
public class KbIn {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub

		char ch;

		System.out.print("Press a key followed by ENTER: ");

		ch = (char) System.in.read(); // get a char; read a character from the keyboard.

		System.out.println("Your key is: " + ch);

	}

}
