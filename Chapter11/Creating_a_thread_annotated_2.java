class apt implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Creating_a_thread_annotated_2 {

	// From the main thread, you can create other threads.
	public static void main(String[] args) {
		
		// You create a thread by instantiating an object of type Thread whose constructor encapsulates an object
		// that is runnable.
		
		// This constructor is only useful when extending Thread to override the run() method.[1]
//		Thread thread = new Thread(); [1]
		
	}

}

/* References:
 * 
 * 1. https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Thread.html#constructor-detail 
 * 
 * */
