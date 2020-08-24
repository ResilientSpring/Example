
public class ModDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double truncated = 10.5 / 1.2 ;
		
		System.out.println("When / is applied to a non-integer: 10.5 / 1.2 = " + truncated);
		
		System.out.println();
		
		int truncated2 = 10 / 3 ;
		System.out.println("When / is applied to an integer, any remainder will be truncated: 10 / 3 = " + truncated2);
		
		System.out.println();
		
		int truncated3 = 10 % 3 ;
		System.out.println("You can obtain the remainder of this division by using the modulus operator %: 10 % 3 = " + truncated3);
		
		System.out.println();
		
		double truncated4 = 10.0 % 3.0 ; 
		System.out.println("The % can be applied to both integer and double types. Thus, 10.0 % 3.0 = " + truncated4);
		
		System.out.println();
		
		float truncated5 = (float) (10.0 % 3.0) ;
		System.out.println("The % can be applied to both integer and floating-point types. Thus, 10.0 % 3.0 = " + truncated5);
		
		System.out.println();
		
		int iresult, irem;
		double dresult, drem;
		
		iresult = 10 / 3 ;
		irem = 10 % 3 ;
		dresult = 10.0 / 3.0 ;
		drem = 10.0 % 3.0 ; 
		
		System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
		System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);
		
		/**
		 * In mathematics, the remainder is the amount "left over" after performing some computation. 
		 * In arithmetic, the remainder is the integer "left over" after dividing one integer by another to produce an integer quotient (integer division). 
		 * In algebra, the remainder is the polynomial "left over" after dividing one polynomial by another. 
		 * The modulo operation is the operation that produces such a remainder when given a dividend and divisor.
		 * 
		 * Source: https://en.wikipedia.org/wiki/Remainder
		 * */

	}

}
