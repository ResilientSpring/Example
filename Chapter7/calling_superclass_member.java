
class Super {
	int i;

	void performative() {
		System.out.println("Super's perfomative method.");
	}
}

class Sub extends Super {
	
	int a = i * 10;
//	i = 10;
	
	void performative() {
		System.out.println("Sub's performative method.");
	}
	
	double decorative() {
		return i + 1;
	}
	
}

public class calling_superclass_member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub sub = new Sub();
		sub.performative();
		
		double catcher = sub.decorative();
		
		System.out.println(catcher);

	}

}
