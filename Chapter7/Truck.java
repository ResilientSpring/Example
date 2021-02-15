// Extend vehicle to create a Truck specialization.
public class Truck extends Vehicle3 {
	
	// This is a constructor for Truck
	public Truck(int p, int f, int m, int c) {
		
		// Initialize Vehicle3 members using Vehicle3's constructor.
		super(p, f, m);
		
		cargocap = c;
	}

	private int cargocap; // cargo capacity in pounds. 
	
	// Accessor methods for cargocap. 
	int getCargo() {
		return cargocap;
	}
	
	void putCargo(int c) {
		
		cargocap = c;
		
	}

}
