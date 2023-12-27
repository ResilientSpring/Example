package modulation;

public class Creating_a_thread implements Runnable {

	
	public static void main(String[] args) {
		
		new Thread(new Creating_a_thread()).start();		
		
	}


	public void run() {
		
		System.out.println();
		
	}
	
}
