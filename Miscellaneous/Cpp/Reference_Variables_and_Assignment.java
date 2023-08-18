package Cpp;

class Car{
	
	int passengers;
	int fuelcap;
	int mpg;
	
}

public class Reference_Variables_and_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car vehicle1 = new Car();
		Car vehicle2 = vehicle1;
		
		vehicle1.mpg = 26;
		
		System.out.println(vehicle1.mpg);
		System.out.println(vehicle2.mpg);
		
		//////////////////////////////////////
		
		Car vehicle3 = new Car();
		
		vehicle2 = vehicle3;
		
		System.out.println(vehicle1.mpg);
		System.out.println(vehicle2.mpg);
		System.out.println(vehicle3.mpg);

	}

}
