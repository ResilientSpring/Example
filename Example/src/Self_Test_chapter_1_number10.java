// Print a conversion table of inches to meters.
// Display 12 feet of conversions, inch by inch. 
// Output a blank line every 12 inches. 
// One meter equals approximately 39.37 inches. 

/* 1 inch = feet =  meters;
 * 2 inches = feet = meters;
 * 3 inches = feet = meters;  
 * n inches = n feet = n meters;
 * 
 * 144 inches = 12 feet = meters;
 * */

/* 1 meter = 39.37 inches. 
 * 
 * (1/39.37) meter = 1 inch. 
 * */

/* 1 feet = 12 inches; 
 * 
 * (1/12) feet = 1 inch;
 * */

/* 1 inch = (1/12) feet = (1/39.37) meters;
 * 2 inches = 2 * (1/12) feet = 2 * (1/39.37) meters;
 * 3 inches = 3 * (1/12) feet = 3 * (1/39.37) meters;  
 * n inches = n * (1/12) feet = n * (1/39.37) meters;
 * 
 * 144 inches = 12 feet = 3.6576 meters;
 * */

public class Self_Test_chapter_1_number10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 1;
		int n = 1; // multiple;

		for (int inch = 1; inch < 145; inch++) {

			float feet =  (float) (inch / 12.00);
			float meter =  (float) (inch / 39.37);

			if (inch == 1) {

				System.out.println(inch + " inch is " + feet + " feet or " + meter + " meters.");

			} else {

				System.out.println(inch + " inches equal " + feet + " feet or " + meter + " meters.");

			}

			n = n + 1;

			if (counter == 12) {

				System.out.println();

				counter = 0;

			} else {
				counter++;
			}

		}

	}

}
