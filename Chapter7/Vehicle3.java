
public class Vehicle3 {

	private int passengers; // number of passengers.
	private int fuelcap; // fuel capacity in gallons.
	private int mpg; // fuel consumption in miles per gallon.

	// Display the range.
	void range() { // The range() method is contained within the Vehicle class.
		System.out.println("Range is " + fuelcap * mpg);
	}

	// Return the range.
	int range2() {
		return mpg * fuelcap;

	}

	// Compute fuel needed for a given distance.
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

	// This is a constructor for vehicle3
	public Vehicle3(int p, int f, int m) {

		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Accessor methods for instance variables.
	int getPassengers() {
		return passengers;
	}

	void setPassengers(int p) {
		passengers = p;
	}

	int getFuelcap() {
		return fuelcap;
	}

	void setFuelcap(int f) {
		fuelcap = f;
	}

	int getMpg() {
		return mpg;
	}

	void setMpg(int m) {

		mpg = m;

	}

}
