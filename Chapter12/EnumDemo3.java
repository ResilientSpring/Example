// Use an enumeration constructor, instance variable, and method.
enum Transportation{
	
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); // Notice the initialization values.
	
	private int typical_speed_of_each_transportation; // add an instance variable.
	
	// Constructor
	Transportation(int s) {
		// TODO Auto-generated constructor stub
		typical_speed_of_each_transportation = s;
	}
	
	int get_speed() {
		return typical_speed_of_each_transportation;
	}
}


public class EnumDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transportation tpTransportation;
		
		// Display speed of an airplane.
		System.out.println("Typical speed for an airplane is " + Transportation.AIRPLANE.get_speed() + " miles per hour.");
		
		// Display all transportations and speeds.
		System.out.println("All Transportation speeds: ");
		
		for (Transportation t : Transportation.values()) {
			System.out.println(t + " typical speed is " + t.get_speed() + " miles per hour.");
		}

	}

}
