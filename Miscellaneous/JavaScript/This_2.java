package JavaScript;

class Car2{
	
	String position;
	String enable;
	String wireless;
	
	
	public Car2(String seats, String engine, String radio) {
		this.position = seats;
		this.enable = engine;
		this.wireless = radio;
	}
	
	
};



public class This_2 {

	public static void main(String[] args) {
		
		Car2 objectCar2 = new Car2("cloth", "V-6", "CD-Player");
		
		System.out.println(objectCar2.position);

	}

}
