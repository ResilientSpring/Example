
class Queue {

	char q[]; // this array holds the queue input

	int putloc, getloc; // the put and get indices

	public Queue(int size) {

		q = new char[size]; // allocate memory for queue.
		putloc = getloc = 0; // the put and get indices (plural of index) are initially set to zero.

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
		// the next element is returned. In this process, getloc is incremented.
		// Thus, getloc always indicates the location of the next element to be
		// retrieved.
	}

}

// Demonstrate the Queue class. 

class QDemo {
	public static void main(String args[]) {

		Queue bigQueue = new Queue(100);
		Queue smallQueue = new Queue(4);
		char ch;
		int i;
		System.out.println("Using bigQ to store the alphabet. ");

		// put some numbers into bigQ
		for (i = 1; i < 26; i++)
			bigQueue.put((char) ('A' + i));

		// retrieve and display elements from bigQ
		System.out.print("Contents of bigQ: ");
		for (i = 0; i < 26; i++) {
			ch = bigQueue.get();
			if (ch != (char) 0)
				System.out.print(ch);
		}

		System.out.println("\n");

		System.out.println("Using smallQueue to generate errors. ");

		// Now, use smallQueue to generate some errors.
		for (i = 0; i < 5; i++) {

			System.out.print("Attempting to store " + (char) ('Z' - i));

			smallQueue.put((char) ('Z' - i));

			System.out.println();
		}

		System.out.println();

		// more errors on smallQueue
		System.out.print("Contents of smallQ: ");
		for (i = 0; i < 5; i++) {
			ch = smallQueue.get();

			if (ch != (char) 0)
				System.out.print(ch);
		}

	}
}
