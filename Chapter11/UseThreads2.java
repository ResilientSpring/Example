
public class UseThreads2 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		}, "myThread2").start();
	}

}
