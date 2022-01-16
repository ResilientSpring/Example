// MyThread variations. This version of MyThread creates a Thread when its constructor is called and 
// stores it in an instance variable called thread_name_String. 
// It also sets the name of the thread and provides a factory method to create and start a thread.
public class ThreadVariations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	public void run() {
		// TODO Auto-generated method stub
		
		
		
	}
	
}
