// Java defines two ways to create a runnable object:
// a class can either implement Runnable interface or extend Thread class.
class Aptness2 implements Runnable{
	
	public Aptness2() {
		
	}	

	// Inside run(), you can write some code that constitutes a thread. main() is a thread, too!
		public void run() {
			
			for (int count = 0; count < 10; count++) {
				
				
				// Because sleep() can throw up an InterruptedException, it must be wrapped in try/catch block.
				try {
					
					Thread.sleep(400);
					
					System.out.println("In Child thread, count is " + count);
					
				} catch (InterruptedException e) {
					
					System.out.println("Thread interrupted.");
					
				}
			}
			
			// thread ends as it reaches its end.
			System.out.println("Child thread will terminate as run() reaches its bottom.");
			
		}
}


public class Creating_a_thread_annotated_3_3 {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {

		System.out.println("Main thread starts.");
		
		Aptness2 aptness2 = new Aptness2();
		
		// You create another thread by creating an object of class Thread whose constructor encapsulates an object
		// that is runnable.
		Thread thread = new Thread(aptness2, "Child thread #1");
		
		thread.run();		
		
		System.out.println("Main thread ends");

	}

}
