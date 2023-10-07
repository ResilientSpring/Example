// MyThread variations. This version of MyThread creates a Thread when its constructor is called and stores it in
// an instance variable called thread.
// It also sets the name of thread and provides a factory method to create and start a thread.

class MyThread20231007_2 implements Runnable{
	
	Thread thread;  // A reference to the thread is stored in thread.
	
	// Construct a new thread using this Runnable and give it a name.
	public MyThread20231007_2(String name) {
		thread = new Thread(thread, name);
	}
	
	static MyThread20231007_2 createAndStart(String name) {
		MyThread20231007_2 myThread20231007_2 = new MyThread20231007_2(name);
		
		myThread20231007_2.thread.start();  // Start the thread. (Begin executing the thread.)
		return myThread20231007_2;
	}

	public void run() {
		
		System.out.println(thread.getName() + " starting.");
		
		try {
			
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thread.getName() + ", count is " + count);
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
}


public class One_Improvement_Two_Simple_Variations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
