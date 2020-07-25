import java.util.Scanner;

/**
 * 
 */

/**
 * @author ted10014
 *
 */
public abstract class Self_Test_chapter_1 {

	/**
	 * 
	 */
	public Self_Test_chapter_1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in); // create a scanner object.
		System.out.println("Type your weight number in Kilogram on the earth: ");

		float weight_input = myObj.nextFloat(); // Read user input.

		float weightOnTheMoon = (float) (weight_input * 0.17);

		System.out.println("Your weight on the moon will be: " + weightOnTheMoon + " Kilograms");

	}
}
