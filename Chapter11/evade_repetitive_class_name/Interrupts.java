package evade_repetitive_class_name;

public class Interrupts implements Runnable {

	public static void main(String[] args) {
	
		System.out.println("Main thread starting.");

	}

	@Override
	public void run() {
		
		int inputs[] = new int[50000];
		
		for (int i = 0; i < inputs.length; i++) {
			i = inputs[i];
			
			heavyCrunch(inputs[i]);
			
			if (Thread.interrupted()) {
				
				System.out.println("We have been interrupted; no more crunching.");
			}
			
			
		}
		
	}
	
	void heavyCrunch(int element) {
		
	}

}
