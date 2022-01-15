
public class UseThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				String thread_nameString = "Child #1";
				
				System.out.println(thread_nameString);
				
				System.out.println(thread_nameString + " starting.");
				
				try {
					for (int count = 0; count < 10; count++) {
						Thread.sleep(400);
						
						System.out.println("In " + thread_nameString + ", count is " + count);
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(thread_nameString + " interrupted.");
				}
				
				System.out.println(thread_nameString + " terminating.");
			}
		});
		
		myThread.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}, "myThread2").start();;
		

	}

}
