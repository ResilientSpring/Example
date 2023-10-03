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
	
	public FixedQueue(int size) {
		q = new char[size];  // allocate memory for queue.
		putloc = getloc = 0;
	}

	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		q[putloc++] = ch;
	}

	public char get() {
		
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			
			return (char) 0;
		}
		return q[getloc++];
	}
	
}


public class Try_This_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
