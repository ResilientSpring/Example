// Uppercase letters.
public class UpCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch; 
		
		for (int i = 0; i < 10; i++) {
			
			ch = (char) ('a' + i);
			System.out.print(ch);
			
			// This statement turns off the 6th bit. 
			ch = (char) ( ch & 65503 );  // ch is now uppercase. 
			
			System.out.print(ch + " ");
		}

	}

}