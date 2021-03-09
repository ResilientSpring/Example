// Method overloading
class AAAA {

	int i, j;

	public AAAA(int a, int b) {

		i = a;
		j = b;

	}

	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class BBBB extends AAAA {

	int k;

	public BBBB(int a, int b, int c) {
		super(a, b);

		k = c;
	}

	void show() {
		super.show();  // This calls A's show().
		System.out.println("k: " + k);
	}

}

public class Override3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BBBB subOBb = new BBBB(1, 2, 3);

		subOBb.show(); // This calls show() in B.
		
		AAAA obAaa = new AAAA(2, 3);
		
		obAaa.show();  // This calls show() in A.

	}

}
