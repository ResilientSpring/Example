package JavaScript;

class Car_4{
	
	char seats;
	char engine;
	char radio;
	
	public Car_4(char seats, char engine, char radio) {
		
		/*
		 * char seats; 
		 * char engine; 
		 * char radio;
		 * 
		 * this.seats = seats;
		 */
		
		this.seats = seats;
		this.engine = engine;
		this.radio = radio;
		
	}
	
	void describe() {
		System.out.println("This amazing car has these features: ");
		System.out.println(seats + " seats, " + engine + " engine, ");
		System.out.println(radio);
	}
}

public class this_4 {

	public static void main(String[] args) {
		
		

	}

}
