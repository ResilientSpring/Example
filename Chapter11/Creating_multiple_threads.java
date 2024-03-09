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
		
		System.out.println("Main thread starting.");
		
		MyThreads mt1 = MyThreads.createAndStart("Child #1");
		MyThreads mt2 = MyThreads.createAndStart("Child #2");
		MyThreads mt3 = MyThreads.createAndStart("Child #3");
		
		for (int i = 0; i < 50; i++) {
			
			System.out.print(".");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
				System.out.println("Main thread interrupted.");
			}
			
		}

		System.out.println("Main thread ending");
	}

}
