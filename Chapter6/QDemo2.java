
class Queue3 {

	private char q[]; // this array holds the queue input

	private int putloc, getloc; // the put and get indices

	public Queue3(int size) {

		q = new char[size]; // allocate memory for queue.
		putloc = getloc = 0; // the put and get indices (plural of index) are initially set to zero.

	}
	
	// Construct a Queue3 from a Queue3
	Queue3(Queue3 ob){
		
		putloc = ob.putloc;
		
		getloc = ob.getloc;
		
		q = new char[ob.q.length];
		
		// copy elements 
		for(int i = getloc; i < putloc; i++)
			q[i] = ob.q[i];		
	}
	
	// Construct a Queue with initial values. 
	public Queue3(char a[]) {
		
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		
		for (int i = 0; i < a.length ; i++) put(a[i]);
	}

	// The put() method, which stores elements.
	// put a character into the queue.
	void put(char ch) {

		if (putloc == q.length) {
			System.out.println(" - Queue is full. ");
			return;
		}

		q[putloc++] = ch;  // the new element is stored at that location and putloc is increment.

	}

	char get() {

		if (getloc == putloc) {
			System.out.println(" - Queue is empty. ");
			return (char) 0;
		}

		return q[getloc++]; // Note the difference between ++getloc and getloc++.
		// After the next element is returned, getloc is incremented.
		// Thus, getloc always indicates the location of the next element to be
		// retrieved.
	}
}

// Demonstrate the Queue class. 
public class QDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Construct 10-element empty queue 
		Queue3 q1 = new Queue3(10);
		
		char name[] = {'T', 'o', 'm'};
		
		// construct queue from array
		Queue3 q2 = new Queue3(name);
		
		char ch;
		int i;
		
		// put some characters into q1 
		for(i = 0 ; i < 10 ; i++)
			q1.put( (char) ('A' + i) );
		
		// Construct queue from another queue
		Queue3 queue3 = new Queue3(q1);
		
		// Show the queue
		System.out.print("Contents of q1: ");
		for (i = 0;  i < 10; i++) {
			
			ch = q1.get();
			
			System.out.print(ch);
			
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of q2: ");
		for ( i = 0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of q3: ");
		for (i = 0; i < 10; i++) {
			
			ch = queue3.get();
			System.out.print(ch);
			
		}

	}

}
