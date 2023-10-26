// Java defines two ways to create a runnable object:
// a class can either implement Runnable interface or extend Thread class.
class aptly implements Runnable {
	
	String thread_name;
	
	aptly(String thread_name) {
		
		this.thread_name = thread_name;
	}

	// Inside run(), you can write some code that constitutes a thread. main() is a thread, too.
	public void run() {
		
		System.out.println(thread_name + " starting.");
		
	}
	
}


public class Creating_a_thread_annotated_3 {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		
		// You create a thread by instantiating an object of type Thread whose constructor encapsulates an object
	    // that is runnable.
		

	}

}
