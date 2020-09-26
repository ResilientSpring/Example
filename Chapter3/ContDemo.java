// Use continue.
public class ContDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i; 
		
		// print even numbers between 0 and 100
		for (i = 0; i <= 100; i++) {
			if ( (i % 2) != 0 ) continue; // iterate
			System.out.println(i);
		}

	}

}
