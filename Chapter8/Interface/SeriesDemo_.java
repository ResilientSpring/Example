package Interface;

class ByTwos_ implements Series {

	int start = 0;
	int val = 0;
	int prev = -2;
	
	public ByTwos_() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getNext() {
		// TODO Auto-generated method stub
		val += 2;
		return val;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		val = start;
	}

	@Override
	public void setStart(int x) {
		// TODO Auto-generated method stub
		start = x;
		val = x;
	}
	
	// It is both permissible and common for classes that implement interfaces to define additional members of their own.	
	int getPrevious() {  // Add a method not defined by Series.
		return prev;
	}
	
}

public class SeriesDemo_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
