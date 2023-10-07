// MyThread variations. This version of MyThread creates a Thread when its constructor is called and stores it in
// an instance variable called thread.
// It also sets the name of thread and provides a factory method to create and start a thread.

class MyThread20231007_2 implements Runnable{
	
	Thread thread;  // A reference to the thread is stored in thread.
	
	// Construct a new thread using this Runnable and give it a name.
	public MyThread20231007_2(String name) {
		thread = new Thread(thread, name);
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


public class One_Improvement_Two_Simple_Variations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
