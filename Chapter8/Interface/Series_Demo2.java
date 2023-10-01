package Interface;

//An interface specifies what must be done, but not how to do it.
interface Series3{
	
	int getNext();
	void reset();
	void setStart(int x);
}


//Implement Series.
class ByTwos3 implements Series3{
	int start; 
	int value;
	int previous;
	
	public ByTwos3() {
		start = 0;
		value = 0;
	}
	
	ByTwos3(int previous) {
		
		this.previous = previous;
		
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

public class Series_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
