// Create a thread by implementing Runnable.
public class Multi_threaded_programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyThreaded implements Runnable {
	
	String thread_nameString;
	
	public MyThreaded(String name) {
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
		}
		
	}
	
}
