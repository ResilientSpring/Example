// A promotion surprise!
public class PromDemo {
	
	/* The Type Promotion Rules
	 * 
	 * type promotion rules that apply to an "expression". 
	 * 
	 * First, within an expression, all byte, short, and char values are promoted to int. 
	 * Then, if one "operand" is a long, the whole expression is promoted to long. 
	 * 
	 * If one operand is a float, the entire expression is promoted to float. 
	 * If any of the operands is double, the result is double.
	 * 
	 * Reference:
	 * 1. https://web.archive.org/web/20200829125831/https://forgetcode.com/java/1709-type-promotion-rules
	 * 2. Textbook page on 92.
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b; // byte is of 8-bit integer, ranging from -128 to 127. Refer to the textbook on page 67.
		int i;
		
		b = 10;
		i = b * b; // OK, no cast needed because result is already elevated to int.
		
		b = 10;
		b = (byte) (b * b) ; // Cast is needed here to assign an int to a byte.
		
		System.out.println("i and b: " + i + " " + b);

	}

}
