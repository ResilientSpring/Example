
public class Multi_threaded_programming_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starting.");
		
		// First, construct a MyThread object.
		MyThread myThread = new MyThread("Child #1");  // Create a runnable object.
		
		// Next, construct a thread from that object.
		Thread thread = new Thread(myThread);
		
		thread.start();
		
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Main thread interrupted.");
			}
		}
		
		System.out.println("Main thread ending.");
	}

}

class MyThread2 implements Runnable {
	
	String thread_nameString;
	
	public MyThread2(String name) {
		// TODO Auto-generated constructor stub
		thread_nameString = name;
	}

	// Entry point of thread.
	public void run() {       // Thread starts executing here.
		System.out.println(thread_nameString + " starting.");
		
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				
				System.out.println("In " + thread_nameString + ", count is " + count);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(thread_nameString + " interrupted.");
		}
		
		System.out.println(thread_nameString + " terminating.");
		
	}
	
}
