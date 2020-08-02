/* 
 * Compute the number of cubic inches in 1 cubic mile.  
 * 
 * Source: page 68 on the referenced textbook.  
 * */

public class Inches {

	public Inches() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long ci;
		long im;
		
		im = 5280 * 12 ; 
		
		ci = im * im * im; 
		
		System.out.println("There are " + ci + " cubic inches in cubic mile.");

	}

}
