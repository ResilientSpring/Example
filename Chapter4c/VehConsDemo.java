
public class VehConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// construct complete vehicles
		Vehicle2 minivanVehicle = new Vehicle2(7, 16, 21);
		Vehicle2 sportscarVehicle = new Vehicle2(2, 14, 12);

		int dist = 252;
		double gallons = minivanVehicle.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

		gallons = sportscarVehicle.fuelneeded(dist);

		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");

	}

}
