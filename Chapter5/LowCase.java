// Lowercase letters.
public class LowCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch; 
		for (int i = 0; i < 10; i++) {
			
			ch = (char) ('A' + i);
			System.out.print(ch);
			
			// This statement turns on the 6th bit. 
			ch = (char) (ch | 32);  // ch is now lowercase. 
			
			/** Binary	       Octal-decimal	   Decimal     Hexadecimal     Glyph
			 *  100 0001	   101	               65           41	              A
			 *  110 0001       141                 97           61                a
			 * 
			 * https://en.wikipedia.org/wiki/ASCII#Printable_characters
			 * 
			 * 
			 * 0000 0000 0100 0001
			 * 0000 0000 0010 0000  or 
			 * -----------------------
			 * 0000 0000 0110 0001
			 *  
			 * */
			
			System.out.print(ch + " ");
		}

	}

}
