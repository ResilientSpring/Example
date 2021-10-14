package Interface;

interface ad_hoc {
	int getNext();
	void reset();
	void setStart(int x);
}

class sniff implements ad_hoc {
	
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


public class SeriesDemo3 implements  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
