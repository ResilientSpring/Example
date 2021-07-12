
class Super2 {
	int i;

	void performative() {
		System.out.println("Super2's perfomative method.");
	}
}

class Sub_class extends Super2 {
	
	int a = i * 10;
	i = 11;
	
	void performative() {
		System.out.println("Sub_class's performative method.");
	}
	
	double decorative() {
		return i + 1;
	}
	
}

public class Inheritance {
	
	public static void main(String[] args) {
		
	}

}
