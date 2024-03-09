class ExtendThread1 extends Thread{
	
	public ExtendThread1(String name) {
		super(name);
	}
	
	// When a class extends Thread, it must override the run() method, which is the entry point for the new thread,
	// It must also call start() to begin execution of the new thread.
	public void run() {
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


public class Try_This_11_1_1 {

	public static void main(String[] args) {
		
		System.out.println("Main thread starting.");
		
		new ExtendThread1("Child #1").start();
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}

}
