// Using break with nested loops. 
public class Break3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {

			System.out.println("Outer loop count: " + i);
			System.out.print("     Inner loop count: ");

			int t = 0;
			
			// Java While Loop 
			// The while loop loops through a block of code as long as a specified condition is true.
			/* 
			   while (condition) {
			   code block to be executed
			   }
			   
			*/ 
			// Source: https://www.w3schools.com/java/java_comments.asp
			
			while (t < 100) {
				if (t == 10)
					break; // terminate loop if t is 10
				System.out.print(t + " ");

				t++;

			}

			System.out.println();

		}

		System.out.println("Loops complete.");

	}

}
