package Inheritance;

class MountainBike3 extends Bicycle {
	private String suspension;

	public MountainBike3(int startCadence, int startSpeed, int startGear, String suspensionType) {
		super(startCadence, startSpeed, startGear);
		this.setSuspension(suspensionType);
	}

	public String getSuspension() {
		return this.suspension;
	}

	public void setSuspension(String suspensionType) {
		this.suspension = suspensionType;
	}

	public void printDescription() {
		super.printDescription();
		System.out.println("The " + "MountainBike has a " + getSuspension() + " suspension.");
	}
}

class RoadBike3 extends Bicycle {
	// In millimeters (mm)
	private int tireWidth;

	public RoadBike3(int startCadence, int startSpeed, int startGear, int newTireWidth) {
		super(startCadence, startSpeed, startGear);
		this.setTireWidth(newTireWidth);
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

public class Polymorphism {

	public static void main(String[] args) {
	    Bicycle bike01, bike02, bike03;

	    bike01 = new Bicycle(20, 10, 1);
	    bike02 = new MountainBike3(20, 10, 5, "Dual");
	    bike03 = new RoadBike3(40, 20, 8, 23);

	    bike01.printDescription();
	    bike02.printDescription();
	    bike03.printDescription();

	}

}
