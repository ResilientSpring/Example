// Java defines two ways in which you can create a runnable object:
// You can implement the Runnable interface or you can extend the Thread class.
class MyThread202310 implements Runnable{
	
	String thread_name;
	
	public MyThread202310(String thread_nameString) {
		
		this.thread_name = thread_nameString;
		
	}

	// Inside run(), you can write some code that constitutes a thread. main() is a thread, too.
	public void run() {
		
		System.out.println(thread_name + " starting.");
		
		
		// Because Thread.sleep() can throw an InterruptedException, it must be wrapped in a try block.
		try {
			// a loop is established that counts from 0 to 9.
			for (int count = 0; count < 10; count++) {
				
				Thread.sleep(400); // causes the thread to suspend for 400 milliseconds.
				System.out.println("In " + thread_name + ", count is " + count);
			}
			
		} catch (InterruptedException e) {
			
			System.out.println(thread_name + " interrupted.");
			
		}
		
		// Thread will end when run() ends.
		System.out.println(thread_name + " terminating.");
	}
	
}


public class Creating_a_Thread_annotated {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		// Create a runnable object. MyThread202310's object is runnable because it has run() method.
		MyThread202310 myThread202310 = new MyThread202310("Child #1");
		
		// You create a thread by instantiating an object of type Thread whose constructor encapsulates an object
		// that is runnable.
		Thread newThread = new Thread(myThread202310);
		// Now, the other thread is constructed.
		
		// Once created, the new thread will not start running until you call its start() method.
		newThread.start();
		// In essence, start() executes a call to run().
		

		System.out.println("Main thread ending.");
	}

}
