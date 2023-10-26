// Java defines two ways to create a runnable object:
// a class can either implement Runnable interface or extend Thread class.
class Aptly1 {
	
}

public class Creating_a_method_3_1 {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		
		System.out.println("Main thread starting.");
		
		// You create a thread by creating an object of type Thread whose constructor encapsulates an object
	    // that is runnable.
		Thread thread = new Thread(null);

	}

}
