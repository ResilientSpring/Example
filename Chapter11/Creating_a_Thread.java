// Create a thread by implementing Runnable.
class MyThread2023 implements Runnable{
	// Objects of MyThread can be run in their own threads because MyThread implements Runnable.
	
	String thrdName;
	
	public MyThread2023(String name) {
		thrdName = name;
	}

	// Entry point of thread.
	public void run() {        // Threads start executing here.
		
		System.out.println(thrdName + " starting.");
		
		try {
			for (int count = 0; count < 10; count++) {
				
				Thread.sleep(400);
				
			}
		} catch (InterruptedException exc) {
			// TODO: handle exception
		}
		
	}
	
}


public class Creating_a_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
