// MyThread variations. This version of MyThread creates a Thread when its constructor is called and stores it in
// an instance variable called thread.
// It also sets the name of thread and provides a factory method to create and start a thread.

class MyThread20231007 implements Runnable{
	
	Thread thread;  // A reference to the thread is stored in thread.
	
	// Construct a new thread using this Runnable and give it a name.
	public MyThread20231007(String name) {
		thread = new Thread(this, name);
	}
	
	static MyThread20231007 createAndStart(String name) {
		
		MyThread20231007 myThread20231007 = new MyThread20231007(name);
		
		return myThread20231007;
		
	}

	public void run() {
		// TODO Auto-generated method stub
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


public class One_Improvement_and_Two_Simple_Variations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starting.");
		
		// Create and start a new thread.
		MyThread20231007 myThread20231007 = MyThread20231007.createAndStart("Child #1");

	}

}
