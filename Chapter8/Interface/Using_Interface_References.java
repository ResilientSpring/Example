package Interface;

// An interface specifies what to do, not how to do.
interface Seriess{
	int getNext();
	void reset();
	void setStart(int x);
}

class ByTwoss implements Seriess{
	
	int start;
	int value;
	
	public ByTwoss() {
		start = 0;
		value = 0;
	}

	@Override
	public int getNext() {
		value += 2;
		return value;
	}

	@Override
	public void reset() {
		value = start;
		
	}

	@Override
	public void setStart(int x) {
		// TODO Auto-generated method stub
		start = x;
		value = x;
	}
	
}

public class Using_Interface_References {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
