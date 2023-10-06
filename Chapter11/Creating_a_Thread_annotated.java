// Java defines two ways in which you can create a runnable object:
// You can implement the Runnable interface or you can extend the Thread class.
class MyThread202310 implements Runnable{
	
	String thread_nameString;
	
	public MyThread202310(String thread_nameString) {
		
		this.thread_nameString = thread_nameString;
		
	}

	public void run() {
		
		System.out.println(thread_nameString + " starting.");
		
	}
	
}


public class Creating_a_Thread_annotated {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		// Create a runnable object. MyThread202310's object is runnable because it has run() method.
		
		// You create a thread by instantiating an object of type Thread whose constructor encapsulates an object
		// that is runnable.
		Thread newtThread = new Thread();
//		newtThread.setContextClassLoader(myThread2023);

	}

}
