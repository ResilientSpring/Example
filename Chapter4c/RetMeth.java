
// Use a return value. 
public class RetMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		// AssignAddExpression values to fields in minivan
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		// assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12; 
		
		// get the ranges 
		range1 = minivan.range2();    // Assign the value returned to a variable.
		range2 = sportscar.range2();  // Assign the values returned to a variable.
		
		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");
		
		System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles");

	}

}
