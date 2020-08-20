// Demonstrate dynamic initialization.

public class DynInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 4, height = 5; 
		
		// dynamically initialize volume 
		double volume = 3.1416 * radius * radius * height ; // volume is dynamically initialized at runtime. 
		
		// The key point here is that the initialization expression can use any element valid at the time of initialization, 
		// including calls to methods, other variables, or literals.
		
		System.out.println("Volume is " + volume);

	}

}
