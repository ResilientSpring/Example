// Java defines two ways to create a runnable object:
// a class can either implement Runnable interface or extend Thread class.
class Aptly implements Runnable {
	
	String thread_name;
	
	Aptly(String thread_name) {
		
		this.thread_name = thread_name;
	}

	// Inside run(), you can write some code that constitutes a thread. main() is a thread, too.
	public void run() {
		
		System.out.println(thread_name + " starting.");
		
		for (int count = 0; count < 10; count++) {
			
			// Because Thread.sleep() can throw an InterruptedException, it must be wrapped in a try block.
			try {
				
				Thread.sleep(400);
				
				System.out.println("In " + thread_name + ", count is " + count);
				
			} catch (InterruptedException e) {
				
				System.out.println(thread_name + " interrupted.");
			}
			
		}
		
		// Thread will end when run() ends.
		System.out.println(thread_name + " terminating.");
	}
	
}


public class Creating_a_thread_annotated_3 {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		
		System.out.println("Main thread starting.");
		
		// Aptly's objects are runnable because they implement Runnable interface. 
		Aptly apt = new Aptly("Child thread");
		
		// You create a thread by instantiating an object of type Thread whose constructor encapsulates an object
	    // that is runnable.
		Thread thread = new Thread(apt);
		
		thread.run();
		
		
		System.out.println("Main thread ending.");

	}

}
