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
		}
		
		super.run();
	}
	
}

public class Try_This_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
