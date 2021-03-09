// Method overloading
class AA {

	int i, j;

	public AA(int a, int b) {

		i = a;
		j = b;

	}

	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class BB extends AA {

	int k;

	public BB(int a, int b, int c) {
		super(a, b);

		k = c;
	}

	// display k - this overrides show() in AA
	void show() { // This show() in BB overrides the one defined by A.
		System.out.println("k: " + k);
	}

}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BB subOBb = new BB(1, 2, 3);

		subOBb.show(); // This calls show() in B.

	}

}
