
public class PromDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b;
		int i;
		
		b = 10;
		i = b * b; // OK, no cast needed because result is already elevated to int.
		
		b = 10;
		b = (byte) (b * b) ; // Cast is needed here to assign an int to a byte.
		
		System.out.println("i and b: " + i + " " + b);

	}

}
