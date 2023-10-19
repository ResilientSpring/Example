// Create multiple threads.

class MyThreads implements Runnable{

	Thread thread;
	
	public MyThreads(String name) {
		
		thread = new Thread(this, name);
	
	}
	
	
	static MyThreads createAndStart(String name) {
		
		MyThreads myThreads = new MyThreads(name);
		
		return myThreads;
		
	}
	
	
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


public class Creating_multiple_threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
