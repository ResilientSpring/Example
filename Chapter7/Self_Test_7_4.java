
class concede {
	int a;
	int b;
	int c;
	
	public concede(int d, int e, int f) {
		a = d;
		b = e;
		c = f;
	}
	
	void performant() {
		System.out.println("This is the from superclass.");
	}
}

class secret_sauce extends concede{
	
	int g;
	int h;
	int i;
	
	public secret_sauce() {
		super(g, h, i);
		
		
	}
	
	void performant() {
		super.performant();
		
		System.out.println("This is from sub-class.");
	}
}


public class Self_Test_7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
