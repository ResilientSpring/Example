package evade_repetitive_class_name;

class MyThread2023_2 extends Thread{
	
	int n;
	
	MyThread2023_2(int thread_number) {
		
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

public class Creating_a_Thread_2 {

	public static void main(String[] args) {
		
		System.out.println("Main thread starting.");
		
		// MyThread2023's object is runnable because it inherits run() from Thread class.
		MyThread2023_2 myThread2023_2 = new MyThread2023_2(1);
		
		myThread2023_2.start();
		
		myThread2023_2.run();
		
		// Creating a thread by instantiating Thread class. Its constructor encapsulates a runnable object.
		Thread thread = new Thread(myThread2023_2, "Child thread");
		
		thread.start();
		
		thread.run();
		
		System.out.println("Main thread ending.");

	}

}
