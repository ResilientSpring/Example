// MyThread variations. This version of MyThread creates a Thread when its constructor is called and 
// stores it in an instance variable called thread_name_String. 
// It also sets the name of the thread and provides a factory method to create and start a thread.
public class ThreadVariations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread starting.");
		
		// Create and start a thread.
		MyThread_improvement myThread_improvement = MyThread_improvement.createAndStart("Child #1");
		// Now the new thread starts when it is created.
		
		for (int i = 0; i < 50; i++) {
			System.out.print('.');
			
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

class MyThread_improvement implements Runnable{
	
	Thread thread;  // A reference to the thread is stored in thread.
	
	public MyThread_improvement(String name) {
		thread = new Thread(this, name); // The thread is named when it is created.
		
	}
	
	// A factory method that creates and starts a thread.
	public static MyThread_improvement createAndStart(String name) {
		MyThread_improvement myThread_improvement = new MyThread_improvement(name);
		
		myThread_improvement.thread.start();
		
		return myThread_improvement;
	}

	// Entry point of thread.
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(thread.getName() + " starting.");
		
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				
				System.out.println("In " + thread.getName() + ", count is " + count);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(thread.getName() + " interrupted.");
		}
		
		System.out.println(thread.getName() + " terminating.");
		
	}
	
}
