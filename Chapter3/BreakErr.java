// This program contains an error. 
public class BreakErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		one: for (int i = 0; i < 3; i++) {

			System.out.println("Pass " + i + ": ");

		}

		for (int j = 0; j < 100; j++) {
			if (j == 100)
				break one; // wrong
			System.out.print(j + " ");
		}

	}

}
