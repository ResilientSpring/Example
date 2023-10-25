
class ExtendThread2 extends Thread{
	
	public ExtendThread2(String name) {
		super(name);
	}
	
	static ExtendThread2 createAndStart(String name) {
		
		ExtendThread2 myExtendThread2 = new ExtendThread2(name);
		
		myExtendThread2.start();
		
		return myExtendThread2;
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

public class Try_This_11_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starting.");
		
		// Create and start a thread in one step.
		ExtendThread2 myExtendThread = ExtendThread2.createAndStart("Child #1");
		
		
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
