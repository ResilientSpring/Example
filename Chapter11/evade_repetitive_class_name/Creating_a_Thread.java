// Adapting Create_a_Thread.java to creating a runnable object by extending Thread class. 
package evade_repetitive_class_name;

// Java defines two ways to create a runnable object:
// a class can either implement Runnable interface or extend Thread class.
class MyThread2023 extends Thread{
	
	int n;
	
	MyThread2023(int thread_number) {
		
		n = thread_number;
		
	}
	
	// Entry point of the thread.
	public void run() {
		
		System.out.println(getName() + " starting.");
		
		// Because Thread.sleep() can throw up an InterruptedException, it must be wrapped in try/catch block.
		try {
		
			for (int count = 0; count < 10; count++) {
				
				Thread.sleep(400);
				
				System.out.println("In " + getName() + ", count is " + count);
			}
			
		} catch (InterruptedException exc) {
			
			System.out.println(getName() + " interrupted.");
		}
		
		System.out.println(getName() + " terminating.");
	}
	
}

public class Creating_a_Thread {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		
		// Creating a thread by instantiating Thread class. Its constructor encapsulates a runnable object.
		Thread thread = new Thread(null, null);
		

	}

}
