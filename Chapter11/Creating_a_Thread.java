// Create a thread by implementing Runnable.
class MyThread2023 implements Runnable{
	// Objects of MyThread can be run in their own threads because MyThread implements Runnable.
	
	String thrdName;
	
	public MyThread2023(String name) {
		thrdName = name;
	}

	// Entry point of thread.
	public void run() {        // Threads start executing here.
		
		System.out.println(thrdName + " starting.");
		
		try {
			for (int count = 0; count < 10; count++) {
				
				Thread.sleep(400);
				
				System.out.println("In " + thrdName + ", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating.");
	}
	
}


public class Creating_a_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread starting.");
		
		// First, construct a MyThread object.
		MyThread2023 myThread2023 = new MyThread2023("Child #1");  // Create a runnable object.
		
		// Next, construct a thread from that object.
		Thread newThread = new Thread(myThread2023);  // Construct a thread on that object.

	}

}
