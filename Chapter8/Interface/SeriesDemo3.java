package Interface;

interface ad_hoc_Series {
	int getNext();
	void reset();
	void setStart(int x);
}

class Sniff_ByTwos implements ad_hoc_Series {
	
	int start = 0;
	int value = 0;
	
	// The method that implements an interface must be declared as public.
	public int getNext() {
		
		value += 2;
		
		return value;
		
	}
	
	public void reset() {
		value = start;
	}
	
	public void setStart(int x) {
		start = x;
		value = x;
	}
	
}


public class SeriesDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sniff_ByTwos sniff_ByTwos = new Sniff_ByTwos();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + sniff_ByTwos.getNext());
		}
		
		System.out.println("\nResetting ");
		
		sniff_ByTwos.reset();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + sniff_ByTwos.getNext());
		}
		
		System.out.println("\nStarting at 100");
		
		sniff_ByTwos.setStart(100);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + sniff_ByTwos.getNext());
		}
		

	}

}
