// Create multiple threads.

class MyThreads implements Runnable{

	Thread thread;
	
	public MyThreads(String name) {
		
		thread = new Thread(this, name);
	
	}
	
	
	static MyThreads createAndStart(String name) {
		
		MyThreads myThreads = new MyThreads(name);
		
		myThreads.thread.start();
		
		return myThreads;
		
	}
	
	
	public void run() {
		
		System.out.println(thread.getName() + " starting.");
		
		try {
			
			for (int count = 0; count < 10; count++) {
				
				Thread.sleep(400);
				System.out.println("In " + thread.getName() + ", count is " + count);
			}
			
		} catch (InterruptedException e) {
			System.out.println(thread.getName() + " interrupted.");
		}
		System.out.println(thread.getName() + " terminating.");		
	}
	
	
	
}


public class Creating_multiple_threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
