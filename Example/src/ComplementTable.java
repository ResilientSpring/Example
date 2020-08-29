// Try this: 2-2: 6. On your own, try modifying the program so that it uses and displays 1's and 0's, rather than 
// true and false. 
public class ComplementTable {
	
	/* public void println() \ Terminates the current line by writing the line separator string. 
	 * The line separator string is defined by the system property line.separator, 
	 * and is not necessarily a single newline character ('\n').
	 * 
	 * public void println​(boolean x) \ Prints a boolean and then terminate the line. 
	 * This method behaves as though it invokes print(boolean) and then println().
	 * 
	 * Reference: https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/io/PrintStream.html#println(char%5B%5D)
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("P\tQ\tAND\tOR\tXOR\tNOT");
	//	System.out.print("P\tQ\tAND\tOR\tXOR\tNOT\n");
		
		boolean p, q;
		
		p= true; q= true;
		System.out.println("1\t1\t");
		if (p & q) {
			System.out.print("1\t"); 
			} else { 
				System.out.print("0\t"); 
				}
		if (p | q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}
		if (p^q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}
		if (!p) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}
		
		String oneTab = "1\t";
		String zeroTab = "0\t";
		
		p= true; q= false;
		System.out.printf(oneTab, zeroTab);
		
		System.out.println(oneTab + zeroTab);

	}

}
