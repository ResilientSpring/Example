

public class Sound {

	public Sound() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Assume that the time interval is 7.2 seconds. 
		double time_interval = 7.2; 
		
		// Sound travels approximately 1,100 feet per second through air.
		int travel_distance_sound = 1100;
		double distance_travelled_sound = 1100;
		
		// To compute the distance, you will multiply 7.2 by 1100.
		double distance1 = time_interval * travel_distance_sound ;
		double distance2 = time_interval * distance_travelled_sound ; 
		
		System.out.println("The distance to the lightning is " + distance1 + " feet.");
		System.out.println("The distance to the lightning is " + distance2 + " feet.");

	}

}
