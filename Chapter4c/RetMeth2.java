
public class RetMeth2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		
		
		// AssignAddExpression values to fields in minivan
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		// assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12; 
		
		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + minivan.range2() + " miles");
		
		System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + sportscar.range2() + " miles");

	}

}
