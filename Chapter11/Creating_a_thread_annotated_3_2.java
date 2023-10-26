// Java defines two ways to create a runnable object:
// a class can either implement Runnable interface or extend Thread class.
class Aptness implements Runnable{
	
	Aptness() {
		
	}
	
	// Inside run(), you can write some code that constitutes a thread. main() is a thread, too!
	public void run() {
		
		for (int count = 0; count < 10; count++) {
			
			
			// Because sleep() can throw up an exception, it must be enclosed in try/catch block.
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				System.out.println("Thread interrupted.");
				
			}
			
		}
		
	}
	
}

public class Creating_a_thread_annotated_3_2 {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		
		// You create another thread by creating an object of class Thread whose constructor encapsulates an object
		// that is runnable.
		
	}

}
