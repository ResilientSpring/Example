
class concession {
	int a;
	int b;
	int c;
	
	public concession(int d, int e, int f) {
		// TODO Auto-generated constructor stub
		
		a = d;
		b = e;
		c = f;
	}
	
	void performant() {
		System.out.println("This is the from superclass.");
	}
}

class excerpt extends concession {
	
	int a = 18;
	int g = super.a;

	public excerpt(int d, int e, int f) {
		super(d, e, f);
		// TODO Auto-generated constructor stub
		
		System.out.println("a and super.a are " + a + ", " + g);
		
	}
	
}


public class Self_Test_7_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		excerpt callbackExcerpt = new excerpt(1, 2, 3);

	}

}
