// A subclass of TwoDShape for rectangles.
public class Rectangle_extends_abstract_superclass extends TwoDShape_abstract {
	
	// A default constructor
	public Rectangle_extends_abstract_superclass() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	// Constructor for Rectangle
	Rectangle_extends_abstract_superclass(double w, double h){
		super(w, h, "rectangle");  // Call superclass constructor
	}
	
	// Construct a square
	Rectangle_extends_abstract_superclass(double x) {
		super(x, "rectangle");  // call superclass constructor
	}
	
	// Construct an object from an object. 
	Rectangle_extends_abstract_superclass(Rectangle_extends_abstract_superclass ob){
		super(ob); // pass object to TwoDShape constructor.
	}
	
	boolean isSquare() {
		
		if ( getWidth() == getHeight() )
			return true;
		
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
