// Demonstrate an if-else-if ladder.
public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x; 
		
		for (x=0; x<6 ;x++) {
			if (x == 1) 
				System.out.println("X is one");
			else if (x == 2) 
				System.out.println("X is two");
			else if (x == 3) 
				System.out.println("X is three");
			else if (x == 4) 
				System.out.println("X is four");
			else 
				System.out.println("X is not between 1 and 4"); // This is the default statement.
		}

	}

}
