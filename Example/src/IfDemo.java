/**
 * 
 */

/**
 * @author ted10014
 *
 */
public class IfDemo {

	/**
	 * 
	 */
	public IfDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c; 
		
		a = 2 ; 
		b = 3 ;
		
		if (a<b) {
			
			System.out.println("a is less than b");
		}
		
		if (a == b) {
			
			System.out.println("You won't see this");
		}
		
		System.out.println();
		
		c = a -b ;
		
		System.out.println("c contains -1");
		
		if (c >= 0) System.out.println("c is non-negative");
		if (c < 0) System.out.println("c is negative");
		
		System.out.println();
		
		c = b - a ; // c now contains 1 
		
		System.out.println("c contains 1");
		if (c >= 0) System.out.println("c is non-negative");
		if (c < 0) System.out.println("c is negative");

	}

}
