package Inheritance;

public class MountainBike extends Bicycle {
	
    // the MountainBike subclass adds one field
    public int seatHeight;

	public MountainBike(int startCadence, int startSpeed, int startGear, int startHeight) {
		super(startCadence, startSpeed, startGear);
		// TODO Auto-generated constructor stub
		seatHeight = startHeight;
	}
	
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
