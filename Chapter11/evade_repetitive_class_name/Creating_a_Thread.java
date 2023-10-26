// Adapting Create_a_Thread.java to creating a runnable object by extending Thread class. 
package evade_repetitive_class_name;

// Java defines two ways to create a runnable object:
// a class can either implement Runnable interface or extend Thread class.
class MyThread2023 extends Thread{
	
	String thread_name;
	
	MyThread2023(String thread_name) {
		
		this.thread_name = thread_name;
		
	}
	
	
	void run() {
		
	}
	
}

public class Creating_a_Thread {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		
		// Creating a thread by instantiating Thread class. Its constructor encapsulates a runnable object.
		Thread thread = new Thread(null, null);
		

	}

}
