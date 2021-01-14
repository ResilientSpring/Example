// Demonstrate the bitwise NOT.
public class NotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = -34;
		for (int t = 128; t > 0; t = t/2) {
			if( (b & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
		
		System.out.println();
		
		// reverse all bits
		b = (byte) -b;
		
		for (int t = 128; t > 0; t = t / 2) {
			
			if((b & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
			
		}

	}

}

// See also: https://web.archive.org/web/20201112013328/https://web.stanford.edu/class/cs101/bits-bytes.html
