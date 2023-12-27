package modulation;

public class Creating_a_thread implements Runnable {
	
	String threadName;

	
	public static void main(String[] args) {
		
		System.out.println("Main thread starting.");
		
		new Thread(new Creating_a_thread("Child #1")).start();		
		
		for (int i = 0; i < 50; i++) {
			
			System.out.print(".");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		}
		
		System.out.println("Main thread ending.");
	}


	public void run() {
		
		System.out.println(threadName + " starting.");
		
		try {
			
			for (int count = 0; count < 10; count++) {
				
				Thread.sleep(400);
				
				System.out.println("In " + threadName + ", count is " + count);
				
			}
			
		} catch (InterruptedException exc) {
			
			System.out.println(threadName + " interrupted.");
			
		}
		
		System.out.println(threadName + " terminating.");
	}
	
	public Creating_a_thread(String threadName) {
		
		this.threadName = threadName;
	}
	
}
