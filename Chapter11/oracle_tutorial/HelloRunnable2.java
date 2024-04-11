package oracle_tutorial;

public class HelloRunnable2 implements Runnable {

	public static void main(String[] args) {
		
		new Thread(new HelloRunnable2()).start();

	}

	
	public void run() {
		
		System.out.println("Hello from a thread");
		
	}
	
	

}

//Reference: 
//https://web.archive.org/web/20230702090555/https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
