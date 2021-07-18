
class Cohesion {

	int a, b, c;

	public Cohesion(int i, int j, int k) {
		// TODO Auto-generated constructor stub

		a = i;
		b = j;
		c = k;
	}

	void polymorphy() {

		if ((b * c) > 0) {
			System.out.println("A reference variable of a superclass can be assigned an object of "
					+ "any subclass derived from that superclass.");
		}

		System.out.println();

		if ((c * b) > 0) {
			System.out.println("When a reference to a subclass object is assigned to a superclass reference variable, "
					+ "you will have access only to those parts of the object defined by the superclass.");

			System.out.print("It makes sense because superclass has no knowledge of what a subclass adds to it.");
		}

	}

}

class Subversion extends Cohesion {

	int d, e, f;

	public Subversion(int i, int j, int k) {
		super(i, j, k);
		// TODO Auto-generated constructor stub

		d = i;
		e = j;
		f = k;
	}

	void polymorphy() {
		System.out.println("When an overridden method is called through a superclass reference variable, "
				+ "Java determines which version of that method to execute based upon the type of the object "
				+ "being referred to at the time the call occurs.");
	}

}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cohesion superCohesion = new Cohesion(2, 4, 6);
		Subversion subversion = new Subversion(8, 10, 12);

		Cohesion superReferenceVariableCohesion;

		superReferenceVariableCohesion = superCohesion;
		superReferenceVariableCohesion.polymorphy();

		System.out.println("\n");

		superReferenceVariableCohesion = subversion;
		superReferenceVariableCohesion.polymorphy();

	}

}
