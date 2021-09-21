package Inheritance;

class MountainBike2 extends Bicycle {
	private String suspension;

	public MountainBike2(int startCadence, int startSpeed, int startGear, String suspensionType) {
		super(startCadence, startSpeed, startGear);
		
		suspension = suspensionType;
	}

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspensionType) {
		suspension = suspensionType;
	}

	public void printDescription() {
		super.printDescription();
		
		System.out.println("The " + "MountainBike has a " + getSuspension() + " suspension.");
	}
}

class RoadBike2 extends Bicycle {
	// In millimeters (mm)
	private int tireWidth;

	public RoadBike2(int startCadence, int startSpeed, int startGear, int newTireWidth) {
		super(startCadence, startSpeed, startGear);
		
		tireWidth = newTireWidth;
	}

	public int getTireWidth() {
		return this.tireWidth;
	}

	public void setTireWidth(int newTireWidth) {
		this.tireWidth = newTireWidth;
	}

	public void printDescription() {
		super.printDescription();
		
		System.out.println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
	    Bicycle bike01, bike02, bike03;

	    bike01 = new Bicycle(20, 10, 1);
	    bike02 = new MountainBike2(20, 10, 5, "Dual");
	    bike03 = new RoadBike2(40, 20, 8, 23);

	    bike01.printDescription();
	    bike02.printDescription();
	    bike03.printDescription();

	}

}
