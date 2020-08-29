// Try this: 2-2: 6. On your own, try modifying the program so that it uses and displays 1's and 0's, rather than 
// true and false. 
public class ComplementTable {

	/*
	 * public void println() \ Terminates the current line by writing the line
	 * separator string. The line separator string is defined by the system property
	 * line.separator, and is not necessarily a single newline character ('\n').
	 * 
	 * public void println​(boolean x) \ Prints a boolean and then terminate the
	 * line. This method behaves as though it invokes print(boolean) and then
	 * println().
	 * 
	 * Reference:
	 * https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/io/
	 * PrintStream.html#println(char%5B%5D)
	 */

	/*
	 * java line separator explained:
	 * 
	 * public static String lineSeparator() on Windows systems, it returns “\r\n” or
	 * a positive integer.
	 * 
	 * Reference:
	 * https://www.geeksforgeeks.org/system-lineseparator-method-in-java-with-
	 * examples/
	 */

	/*
	 * “\r” stands for "carriage return" on the textbook page 74.
	 * 
	 * Carriage return is the key on a computer keyboard that you press in order to
	 * move down a line on the screen, or to mark the end of a section of text or
	 * data, or the act of pressing this key.
	 * 
	 * Reference:
	 * https://dictionary.cambridge.org/dictionary/english/carriage-return
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.print("P\tQ\tAND\tOR\tXOR\tNOT");
		// System.out.print("P\tQ\tAND\tOR\tXOR\tNOT\n");
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		boolean p, q;

		p = true;
		q = true;
		System.out.print("1\t1\t");
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
		if (p ^ q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}
		if (!p) {
			System.out.println("1\t");
		} else {
			System.out.println("0\t");
		}

		String oneTab = "1\t";
		String zeroTab = "0\t";

		p = true;
		q = false;
		System.out.printf(oneTab + zeroTab);
		if (p & q) {
			System.out.print(oneTab);
		} else {
			System.out.print(zeroTab);
		}
		if (p | q) {
			System.out.print(oneTab);
		} else {
			System.out.print(zeroTab);
		}
		if (p ^ q) {
			System.out.print(oneTab);
		} else {
			System.out.print(zeroTab);
		}
		if (!p) {
			System.out.println(oneTab);
		} else {
			System.out.println(zeroTab);
		}
		
		p= false ; q = true;
		System.out.print(zeroTab + oneTab);
		if (p&q) {
			when_true();
		} else {
			when_false();
		}
		if (p|q) {
			when_true();
		} else {
			when_false();
		}
		if (p^q) {
			when_true();
		} else {
			when_false();
		}
		if (!p) {
			when_true();
			System.out.println();
		} else {
			when_false();
		}		
		
		p= false; q= false;
		System.out.print(zeroTab + zeroTab);
		if (p&q) {
			when_true();
		} else {
			when_false();
		}
		if (p|q) {
			when_true();
		} else {
			when_false();
		}
		if (p^q) {
			when_true();
		} else {
			when_false();
		}
		if (!p) {
			when_true();
		} else {
			when_false();
		}
	}
	
	static void when_true() {
		// System.out.print(oneTab);		
		   System.out.print("1\t");
	} 
	
	static void when_false() {
		System.out.print("0\t");
	}

}
