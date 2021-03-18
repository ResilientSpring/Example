
public class CompFuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle minivanVehicle = new Vehicle();
		Vehicle sportscarVehicle = new Vehicle();
		double gallons;
		int dist = 252;
		
		// assign values to fields in minivan
		minivanVehicle.passengers = 7;
		minivanVehicle.fuelcap = 16;
		minivanVehicle.mpg = 21;
		
		// assign values to fields in sportscar
		sportscarVehicle.passengers = 2;
		sportscarVehicle.fuelcap = 16;
		sportscarVehicle.mpg =12;
		
		gallons = minivanVehicle.fuelneeded(dist);
		
		System.out.println("To go " + dist + " miles, minivan needs " + gallons + " gallons of fuel.");
		
		gallons = sportscarVehicle.fuelneeded(dist);
		System.out.println("To go " + dist + " miles, sportscar needs " + gallons + " gallons of fuel.");

	}

}
