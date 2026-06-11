
public class Dynamic_Disptach_Demo_2 {

	public static void main(String[] args) {
		
		Sup superOb = new Sup();

		superOb.who();       // In each case, the version of who() to call is determined at run time by ...
		
		superOb = new Sub1();
		superOb.who();       // ... the type of object being referred to.
		
		superOb = new Sub2();
		superOb.who();
		

	}

}
