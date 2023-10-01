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
		// TODO Auto-generated method stub
		
	}
}

public class Series_Demo {

	public static void main(String[] args) {
		

	}

}
