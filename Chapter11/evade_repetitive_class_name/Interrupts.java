package evade_repetitive_class_name;

public class Interrupts implements Runnable {

	public static void main(String[] args) {
	
		System.out.println("Main thread starting.");

	}

	@Override
	public void run() {
		
		int heavyCrunch[] = new int[500];
		
		for (int i = 0; i < heavyCrunch.length; i++)
			i = heavyCrunch[i];
		
		
	}

}
