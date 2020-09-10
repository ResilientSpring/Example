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
	
	/* Expressions, Statements, and Blocks
	 * 
	 * 1. Operators may be used in building expressions, which compute values; 
	 * 	a. An expression is a construct made up of variables, operators, and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value.
	 * 2. expressions are the core components of statements; statements may be grouped into blocks.
	 * 3. expressions can be made into a statement by terminating the expression with a semicolon (;)
	 * 
	 * Source: 
	 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
	 * https://www.thoughtco.com/expression-2034097
	 * */
	
	/* Chapter 5. Conversions and Promotions
	 * 
	 * 5.1.3. Narrowing Primitive Conversion
	 * 
	 * Source: https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html
	 * 
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
