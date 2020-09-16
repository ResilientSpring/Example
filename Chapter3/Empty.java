// Parts of the for can be empty.
public class Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i = 0; i < 10; ) {  // The iteration expression is missing.
			System.out.println("Pass #" + i);
			i++; // increment loop control var.
		}

	}

}
