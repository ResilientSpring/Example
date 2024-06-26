class OurThread implements Runnable {
	
	Thread thread;
	
	public OurThread() {
		
	}
	
	public OurThread(String name) {
		
		thread = new Thread(this, name);
		
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


public class Creating_multiple_threads_2 {

	public static void main(String[] args) {
		
		System.out.println("Main thread starting.");
		
		OurThread ot1 = new OurThread();
		OurThread ot2 = new OurThread("Child #2");
		OurThread ot3 = new OurThread("Child #3");
		
		// OurThread ot4 = new OurThread("Child #4").thread.start();
		
		new OurThread("Child #5").thread.start();
		new OurThread("Child #6").thread.start();
		
		OurThread ot7 = new OurThread("Child #7");
		
		ot7.thread.start();
		
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
