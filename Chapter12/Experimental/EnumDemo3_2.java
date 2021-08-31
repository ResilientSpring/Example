package Experimental;

enum Transportation{
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	int typical_speed;

	Transportation(int i) {
		typical_speed = i;
	}
	
	void show() {
		System.out.println("Typical speed is at " + typical_speed);
	}
}

public class EnumDemo3_2 {

	public static void main(String[] args) {
		
		// Similar to int a = 1; 
		Transportation a = Transportation.TRUCK;
		
		// Transportation's method.
		System.out.println(a.typical_speed);
		
		a.show();
		
		System.out.println("Typical speed of boat is at " + Transportation.BOAT.typical_speed);
	}

}
