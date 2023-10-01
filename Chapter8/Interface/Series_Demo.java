package Interface;

// An interface specifies what must be done, but not how to do it.
interface Series2{
	
	int getNext();
	void reset();
	void setStart(int x);
}


// Implement Series.
class ByTwos implements Series2{
	int start; 
	int value;
	
	public ByTwos() {
		start = 0;
		value = 0;
	}
	
	public int getNext() {
		value += 2;
		return value;
	}
}

public class Series_Demo {

	public static void main(String[] args) {
		

	}

}
