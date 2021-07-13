class conceding {
	int a;
	int b;
	int c;
	
	public conceding(int d, int e, int f) {
		a = d;
		b = e;
		c = f;
	}
	
	void performant() {
		System.out.println("This is the from superclass.");
	}
}

class secret_formula extends concede{
	
	int g = 10;
	int h;
	int i;
	
	public secret_formula() {
		super(g, h, i);
		
		
	}
	
	void performant() {
		super.performant();
		
		System.out.println("This is from sub-class.");
	}
}

public class super_constructor {

}
