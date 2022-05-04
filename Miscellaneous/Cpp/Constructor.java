package Cpp;

class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;
	
	public Vehicle(int passenger, int fuelcap, int mpg) {
		// TODO Auto-generated constructor stub
		this.passengers = passenger;
		this.fuelcap = fuelcap;
		this.mpg = mpg;
	}
	
	int range() {
		return fuelcap * mpg;
	}
}

public class Constructor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle minivanVehicle = new Vehicle(7, 16, 21);
		Vehicle sportscarVehicle = new Vehicle(2, 14, 12);
		
		int range1, range2;
		
		range1 = minivanVehicle.range();
		range2 = sportscarVehicle.range();
		
		System.out.println("Minivan can carry " + minivanVehicle.passengers + " with a range of " + range1);
		System.out.println("Sportscar can carry " + sportscarVehicle.passengers + " with a range of " + range2);

	}

}
