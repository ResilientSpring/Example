
public class Vehicle2 {

	int passengers; // number of passengers.
	int fuelcap;    // fuel capacity in gallons.
	int mpg;        // fuel consumption in miles per gallon.
	
	// Display the range.
	void range() {    // The range() method is contained within the Vehicle class.
		System.out.println("Range is " + fuelcap * mpg);
	}
	
	// Return the range.
	int range2() {
		return mpg * fuelcap;
		
	}
	
	// Compute fuel needed for a given distance.
	double fuelneeded(int miles) {
		return miles/mpg;
	}
	
	// This is a constructor for Vehicle.
	public Vehicle2(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

}
