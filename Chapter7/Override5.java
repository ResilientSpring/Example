
class Ace{
	int i, j;
	
	public Ace(int a, int b) {
		// TODO Auto-generated constructor stub
		
		i = a;
		
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " +  i + " " + j);
	}
}

class Baclofen extends Ace {
	int k;
	
	public Baclofen(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// display k -- this overrides show() in A
	void show() {
		System.out.println("k: " + k);
	}
}

public class Override5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ace inhibitor_Ace = new Baclofen(2, 4, 6);
		inhibitor_Ace.show();
		

	}

}
