package oracle_tutorial;

public class HelloRunnable2 implements Runnable {

	public static void main(String[] args) {
		
		new Thread(new HelloRunnable()).start();
		

	}

	
	public void run() {
		
		System.out.println("Hello from a thread");
		
	}
	
	

}
