// A character queue interface
interface ICharQ{
	
	// Put a character into the queue.
	void put(char ch);
	
	// Get a character from the queue.
	char get();
}


// A fixed-size queue class for characters.
class FixedQueue implements ICharQ{
	
	private char q[];  // This array holds the queue. 
	private int putloc, getloc; // The put and get indices.

	@Override
	public void put(char ch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char get() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class Try_This_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
