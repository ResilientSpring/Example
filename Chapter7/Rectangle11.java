// A subclass of TwoDShape for rectangles.
public class Rectangle11 extends TwoDShape11 {
	
	// A default constructor.
	public Rectangle11() {
		super();
	}
	
	// Constructor for Rectangle. 
	Rectangle11(double w, double h) {
		super(w, h, "rectangle");      //  call superclass constructor.
	}
	
	// Construct a square. 
	Rectangle11(double x) {
		super(x, "rectangle");         // call superclass constructor.
	}
	
	// Construct an object from an object. 
	Rectangle11(Rectangle11 ob) {
		super(ob);                    // Pass object to TwoDShape constructor.
	}
	
	boolean isSquare() {
		if( getWidth() == getHeight() ) return true;
		
		return false;
	}
	
	// Override area() for Rectangle.
	double area() {
		return getWidth() * getHeight();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
