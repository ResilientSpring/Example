package modulation;

public class Creating_a_thread implements Runnable {
	
	String threadName;

	
	public static void main(String[] args) {
		
		System.out.println("Main thread starting.");
		
		new Thread(new Creating_a_thread("Child #1")).start();		
		
	}


	public void run() {
		
		System.out.println();
		
	}
	
	public Creating_a_thread(String threadName) {
		
		this.threadName = threadName;
	}
	
}
