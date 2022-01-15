
public class UseThreads2 {

	public static void main(String[] args) {
		
		System.out.println("Main thread starting.");
		
		new Thread(new Runnable() {
			
			public void run() {
				
				String thread_nameString = "Child #1";
				
				System.out.println(thread_nameString + " starting.");
				
				try {
					for (int count = 0; count < 10; count++) {
						Thread.sleep(400);
						
						System.out.println("In " + thread_nameString + ", count is " + count);
					}
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println(thread_nameString + " interrupted.");
				}
				
				System.out.println(thread_nameString + " terminating.");
				
			}
		}).start();
		
		for (int i = 0; i < 50; i++) {
			System.out.println(".");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Main thread interrupted");
			}
		}
		
		System.out.println("Main thread ending.");
		
	}

}
