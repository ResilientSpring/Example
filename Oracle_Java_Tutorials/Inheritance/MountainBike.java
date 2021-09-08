package Inheritance;

public class MountainBike extends Bicycle {
	
    // the MountainBike subclass adds one field
    public int seatHeight;
    
    // add a field for suspension, which is a String value that indicates if the bike has a front shock absorber, "Front".
    //  Or, the bike has a front and back shock absorber, "Dual".
    private String suspension;

	public MountainBike(int startCadence, int startSpeed, int startGear, int startHeight) {
		super(startCadence, startSpeed, startGear);
		// TODO Auto-generated constructor stub
		seatHeight = startHeight;
	}
	
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    

    public String getSuspension(){
      return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    // Note the overridden printDescription method. In addition to the information provided before, 
    // additional data about the suspension is included to the output.
    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a" +
            getSuspension() + " suspension.");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
