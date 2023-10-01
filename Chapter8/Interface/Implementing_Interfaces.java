package Interface;

//An interface specifies what must be done, but not how to get it done.
interface Series4{
	
	int getNext();
	void reset();
	void setStart(int x);
}


//Implement Series.
class ByTwos2_ implements Series4{
	
	// It's both permissible and common for classes that implement interfaces to define additional members 
	// of their own.  (It absolutely is.  Without it, how to implement methods in an interface?)
	int start; 
	int value;
	
	public ByTwos2_() {
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


class ByTwos4 implements Series4{
	int start; 
	int value;
	int previous;
	
	public ByTwos4() {
		start = 0;
		value = 0;
	}
	
	ByTwos4(int previous) {
		
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
	
	// Even though the interface does not define this method, it's both permissible and common for classes 
	// that implement interfaces to define additional members of their own.
	int getPrevious() {
		return previous;
	}
}


class ByThrees implements Series4{ // implement Series in a different way.
	int start;
	int value;
	
	ByThrees() {
		// TODO Auto-generated constructor stub
		start = 0;
		value = 0;
	}
	
	public int getNext() {
		value += 3;
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


public class Implementing_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
