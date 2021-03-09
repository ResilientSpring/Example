// Method overloading
class AAA {

	int i, j;

	public AAA(int a, int b) {

		i = a;
		j = b;

	}

	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class BBB extends AAA {

	int k;

	public BBB(int a, int b, int c) {
		super(a, b);

		k = c;
	}

	// display k - this overrides show() in AA
	void show() { // This show() in BB overrides the one defined by A.
		System.out.println("k: " + k);
	}

}

public class Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BBB subOBb = new BBB(1, 2, 3);

		subOBb.show(); // This calls show() in B.
		
		AAA obAaa = new AAA(2, 3);
		
		obAaa.show();  // This calls show() in A.

	}

}
