package Cpp;

class Car2{
	
	int passengers;
	int fuelcap;
	int mpg;
	
}

public class Reference_Variables_and_Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 vehicle1 = new Car2();
		Car2 vehicle2;
		
		vehicle2 = vehicle1;
		
		vehicle1.mpg = 26;
		
		System.out.println(vehicle1.mpg);
		System.out.println(vehicle2.mpg);
		
		System.out.println();

	}

}
