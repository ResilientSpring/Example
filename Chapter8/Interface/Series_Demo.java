package Interface;

// An interface specifies what must be done, but not how to do it.
interface Series2{
	
	int getNext();
	void reset();
	void setStart(int x);
}


// Implement Series.
class ByTwos2 implements Series2{
	int start; 
	int value;
	
	public ByTwos2() {
		start = 0;
		value = 0;
	}
	
	// Whenever you implement a method defined by an interface, it must be implemented as public; 
	// because all members of an interface are implicitly public.
	public int getNext() {
		value += 2;
		return value;
	}
	
	public void reset() {
		value = start;
	}

	@Override
	public void setStart(int x) {
		
		start = x;
		value = x;
		
	}
}

public class Series_Demo {

	public static void main(String[] args) {
		
		ByTwos2 oByTwos2 = new ByTwos2();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Next value is " + oByTwos2.getNext());
		}
		
		System.out.println("\nResetting");
		
		oByTwos2.reset();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + oByTwos2.getNext());
		}
		
		System.out.println("\nStarting at 100");
		
		oByTwos2.setStart(100);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + oByTwos2.getNext());
		}

	}

}
