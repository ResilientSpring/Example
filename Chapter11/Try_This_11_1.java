/*
 * Try This 11-1
 * 
 * Extend Thread.
 * 
 */

class ExtendThread extends Thread{
	
	public ExtendThread(String name) {
		super(name);
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " starting.");
		
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + ", count is " + count);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(getName() + " interrupted.");
		}
		
		System.out.println(getName() + " terminating.");
	}
	
}

public class Try_This_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread starting.");
		
		ExtendThread myExtendThread = new ExtendThread("Child #1");
		
		myExtendThread.start();
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Main thread interrupted.");
			}
		}
		
		System.out.println("Main thread ending.");
	}

}
