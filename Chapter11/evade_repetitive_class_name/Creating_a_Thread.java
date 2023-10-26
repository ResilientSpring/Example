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
		
		System.out.println(getName() + " #" + n + " starting.");
		
		// Because Thread.sleep() can throw up an InterruptedException, it must be wrapped in try/catch block.
		try {
		
			for (int count = 0; count < 10; count++) {
				
				Thread.sleep(400);
				
				System.out.println("In " + getName() + ", count is " + count);
			}
			
		} catch (InterruptedException e) {
			
			System.out.println(getName() + " #" + n + " interrupted.");
		}
		
		System.out.println(getName() + " terminating.");
	}
	
}

public class Creating_a_Thread {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		
		// MyThread2023's object is runnable because it inherits run() from Thread class.
		MyThread2023 myThread2023 = new MyThread2023(1);
		
		// Creating a thread by instantiating Thread class. Its constructor encapsulates a runnable object.
		Thread thread = new Thread(null, null);
		

	}

}
