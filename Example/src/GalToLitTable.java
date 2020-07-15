
public class GalToLitTable {

	/**
	 * 
	 */
	public GalToLitTable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gallons, liters;
		int counter = 0;

		for (gallons = 1; gallons <= 100; gallons++) {

			liters = gallons * 3.7854;

			System.out.println(gallons + " gallons is " + liters + " liters.");

			counter++; // Increment the line counter with each loop iteration.
			
			// Every 10 line, print a blank line.
			if (counter == 10) {

				System.out.println();

				counter = 0; // Reset the line counter.
			}
		}

	}

}
