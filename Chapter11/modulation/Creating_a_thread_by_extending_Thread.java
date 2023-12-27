package modulation;

public class Creating_a_thread_by_extending_Thread extends Thread {
	
	String threadName;
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	@Override
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
	
	public Creating_a_thread_by_extending_Thread(String threadName) {
		
		this.threadName = threadName;

	}

}
