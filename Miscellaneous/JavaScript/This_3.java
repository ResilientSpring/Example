package JavaScript;

class Car3{
	
	String position;
	String enable;
	String wireless;
	
	public Car3(String seats, String engine, String radio) {
		
		position = seats;
		enable = engine;
		wireless = radio;
		
	}
	
	
}

public class This_3 {

	public static void main(String[] args) {
		
		Car3 car3 = new Car3("onyx", "V-8", "CD-Pro2");
		
		System.out.println(car3.position);
		

	}

}
