
class Super3 {
	int i = 10;

	void performative() {
		System.out.println("Super3's perfomative method.");
	}
}

class Sub_class2 extends Super3 {
	
	int a = i * 10;
	i = 11;
	
	void performative() {
		System.out.println("Sub_class2's performative method.");
	}
	
	double decorative() {
		return i + 1;
	}
	
}

public class Inheritance2 {

}
