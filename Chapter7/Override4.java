// Method overriding. 

class AAAAAA{
	int i, j;
	
	public AAAAAA(int a, int b) {
		// TODO Auto-generated constructor stub
		
		i = a;
		
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " +  i + " " + j);
	}
}

class BBBBBB extends AAAAAA {
	int k;
	
	public BBBBBB(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// display k -- this overrides show() in A
	void show() {
		System.out.println("k: " + k);
	}
}

public class Override4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BBBBBB suBbbbbb = new BBBBBB(2, 4, 6);
		suBbbbbb.super.show();

	}

}
