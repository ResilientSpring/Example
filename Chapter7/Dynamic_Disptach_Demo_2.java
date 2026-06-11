
public class Dynamic_Disptach_Demo_2 {

	public static void main(String[] args) {
		
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
