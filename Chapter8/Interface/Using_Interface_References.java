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


class ByThreess implements Seriess{
	
	int start;
	int value;
	
	public ByThreess() {
		start = 0;
		value = 0;
	}

	@Override
	public int getNext() {
		
		value += 3;
		
		return value;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
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
		
		ByTwoss twoOb = new ByTwoss();
		ByThreess threeOb = new ByThreess();
		Seriess ob;
		
		for (int i = 0; i < 5; i++) {
			
			ob = twoOb;
			
			System.out.println("Next ByTwos value is " + ob.getNext());
			
			ob = threeOb;
			
			System.out.println("Next ByThrees value is " + ob.getNext());
			
		}

	}

}
