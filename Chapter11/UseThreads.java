
public class UseThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread starting.");
		
		Thread myThread = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				
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
		});
		
		myThread.start();
		
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
