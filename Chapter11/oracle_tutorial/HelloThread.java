package oracle_tutorial;

public class HelloThread extends Thread {

	public static void main(String[] args) {
		
		new HelloThread().start();

	}
	
	@Override
	public void run() {
		
		System.out.println("Hello from a thread!");
		
	}

}

//Reference: 
//https://web.archive.org/web/20230702090555/https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
