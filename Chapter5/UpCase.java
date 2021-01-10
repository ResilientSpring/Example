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
			
			/** Binary	      Oct	   Decimal     Hexadecimal     Glyph
			 *  100 0001	   101	     65	        41	              A
			 *  110 0001       141       97         61                a
			 * 
			 * https://en.wikipedia.org/wiki/ASCII#Printable_characters
			 * 
			 * 
			 * 0000 0000 0110 0001
			 * 1111 1111 1101 1111  & 
			 * -----------------------
			 * 0000 0000 0100 0001
			 *  
			 * */
			
			System.out.print(ch + " ");
		}

	}

}