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

class CircularQueue implements ICharQ{
	private char q[];  // this array holds the queue.
	private int putloc, getloc;  // the put and get indices.
	
	// Construct an empty queue given its size.
	public CircularQueue(int size) {
		q = new char[size + 1];  // allocate memory for queue
		putloc = getloc = 0;
	}

	public void put(char ch) {
		/*
		 * Queue is full if either putloc is one less than getloc, 
		 * or if putloc is at the end of the array and getloc is at 
		 * the beginning.
		 * */
		
		if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println(" - Queue is full. ");
			return;
		}
		
		q[putloc++] = ch;
		
		if (putloc == q.length) {
			putloc = 0;
		}
		
	}

	public char get() {
		// TODO Auto-generated method stub
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		char ch = q[getloc++];
		
		if (getloc == q.length) {
			getloc = 0;
		}
		
		return ch;
	}
}


class DynQueue implements ICharQ{

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
