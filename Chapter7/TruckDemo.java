
public class TruckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Construct some trucks. 
		Truck semiTruck = new Truck(2, 200, 7, 44000);
		Truck pickupTruck = new Truck(3, 28, 15, 2000);
		double gallons; 
		int dist = 252;
		
		gallons = semiTruck.fuelneeded(dist);
		
		System.out.println("SemiTruck can carry " + semiTruck.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles semiTruck needs " + gallons + " gallons of fuel. \n");
		
		gallons = pickupTruck.fuelneeded(dist);
		
		System.out.println("PickupTruck can carry " + pickupTruck.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles semiTruck needs " + gallons + " gallons of fuel. \n");

	}

}
