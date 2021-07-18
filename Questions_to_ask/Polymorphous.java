
class Superclass {
	
	public Superclass() {
		// TODO Auto-generated constructor stub
	}
	
	void polymorphism() {
		
		System.out.println("A reference variable of a superclass can be assigned an object of "
				+ "any subclass derived from that superclass. \n");
		
		System.out.println("When a reference to a subclass object is assigned to a superclass reference variable, "
				+ "you will have access only to those parts of the object defined by the superclass.\n");
		
		System.out.print("It makes sense because superclass has no knowledge of what a subclass adds to it.\n");
	}
}

class Subclass extends Superclass {
	
	public Subclass() {
		// TODO Auto-generated constructor stub
	}
	
	void polymorphism() {
		System.out.println("When an overridden method is called through a superclass reference variable, "
				+ "Java determines which version of that method to execute based upon the type of the object "
				+ "being referred to at the time the call occurs.");
	}
}

public class Polymorphous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
