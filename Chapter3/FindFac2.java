/*
 * The number of iterations in the inner loop can be reduced. 
 * 
 * Reference:
 * 
 * The textbook page on 131. 
 * 
 * */


public class FindFac2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 100; i++) {

			System.out.print("Factors of " + i + ": ");
			
			for (int j = 2; j < i; j++)

				if ((i % j) == 0)
					System.out.print(j + " ");

			System.out.println();

		}

	}

}
