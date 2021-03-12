// Demonstrate dynamic method dispatch.
class Sup {

	void who() {
		System.out.println("Who() in Sup");
	}
}

class Sub1 extends Sup {

	void who() {
		System.out.println("Who() in Sub1");
	}
}

class Sub2 extends Sup {
	void who() {
		System.out.println("Who () in Sub2");
	}
}

public class Dynamic_Dispatch_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sup superOb = new Sup();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();

		Sup supRef;  // Declaring a variable called supRef of the class type Sup. This variable does not define an object. Instead, it is simply a variable that can refer to an object.
		
		supRef = superOb;
		supRef.who();       // In each case, the version of who() to call is determined at run time by ...
		
		supRef = subOb1;
		supRef.who();       // ... the type of object being referred to.
		
		supRef = subOb2;
		supRef.who();
	}

}
