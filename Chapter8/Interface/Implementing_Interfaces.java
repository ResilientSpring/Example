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


class ByThrees2 implements Series4{ // implement Series in a different way.
	int start;
	int value;
	
	ByThrees2() {
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


// If a class includes an interface but does not fully implement the methods defined by that interface, then
// that class must be declared as abstract.
abstract class implicate implements Series4{
	
	int start;
	
	public void setStart(int start) {
		this.start = start;
	}
	
}


public class Implementing_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ByTwos2_ oByTwos2_ = new ByTwos2_();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + oByTwos2_.getNext());
		}
		
		System.out.println("\nResetting");
		
		oByTwos2_.reset();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + oByTwos2_.getNext());
		}
		
		System.out.println("\nStarting at 100");
		
		oByTwos2_.setStart(100);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Next value is " + oByTwos2_.getNext());
		}
		
		System.out.println();
		
		ByTwos4 oByTwos4 = new ByTwos4(9);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + oByTwos4.getNext());
		}
		
		System.out.println("\nResetting");
		
		oByTwos4.reset();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + oByTwos4.getNext());
		}
		
		System.out.println("\nStarting at 100");
		
		oByTwos4.setStart(100);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Next value is " + oByTwos4.getNext());
		}
		
		System.out.println();
		
		ByThrees2 oByThrees2 = new ByThrees2();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + oByThrees2.getNext());
		}
		
		System.out.println("\nResetting");
		
		oByThrees2.reset();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + oByThrees2.getNext());
		}
		
		System.out.println("\nStarting at 100");
		
		oByTwos4.setStart(100);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Next value is " + oByThrees2.getNext());
		}
		
		System.out.println();

	}

}
