/* Creating the RoadBike class. Because road or racing bikes have skinny tires, 
 * add an attribute to track the tire width. Here is the RoadBike class:
 * */

package Inheritance;

public class RoadBike extends Bicycle {

	// In millimeters (mm)
	private int tireWidth;

	public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth) {
		super(startCadence, startSpeed, startGear);

		tireWidth = newTireWidth;

	}

	public int getTireWidth() {
		return this.tireWidth;
	}

	public void setTireWidth(int newTireWidth) {
		this.tireWidth = newTireWidth;
	}

	// Note that once again, the printDescription method has been overridden.
	// This time, information about the tire width is displayed.
	public void printDescription() {
		super.printDescription();
		System.out.println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
