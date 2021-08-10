
class Enchanted {
	int i, j;
	
	public Enchanted(int a, int b) {
		// TODO Auto-generated constructor stub
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j are " + i + " " + j);
	}
	
	void stilted () {
		System.out.println("(of behavior, speech, or writing) too formal and not smooth or natural.");
	}
}

class Indebted extends Enchanted{
	
	int k;

	public Indebted(int a, int b, int c) {
		super(a, b);
		// TODO Auto-generated constructor stub
		
		k = c;
	}
	
	void show(String message) {
		System.out.println(message + "\n" + "k is " + k);		
	} 
	
	void stilted() {
		System.out.println("(of a person's behaviour or way of speaking or writing) too formal and not smooth or natural.");
	}
	
}

public class Override_v_Overload {
	
	public static void main(String[] args) {
		Indebted indeptednessIndebted = new Indebted(1, 2, 3);
		
		// subclass object has two versions of show() to use, thanks to method overload.
		indeptednessIndebted.show();
		indeptednessIndebted.show("subclass object has two versions of show() to use, thanks to method overload.");
		
		System.out.println();
		
		// subclass object has only one version of stilted() to use as its own stilted() has overridden 
		// that of superclass.
		indeptednessIndebted.stilted();
		
	}

}
