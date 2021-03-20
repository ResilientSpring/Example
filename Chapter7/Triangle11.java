// A subclass of TwoDShape for triangles. 
public class Triangle11 extends TwoDShape11 {
	
	private String style;
	
	// A default constructor.
	public Triangle11() {
		// TODO Auto-generated constructor stub
		super();
		style = "none";
	}
	
	// Constructor for Triangle.
	Triangle11(String s, double w, double h){
		super(w, h, "triangle");
		
		style = s;
	}
	
	// One argument constructor
	Triangle11(double x){
		super(x, "triangle"); // call superclass constructor.
		
		style = "filled";
	}
	
	// Construct an object from an object. 
	Triangle11(Triangle11 ob){
		super(ob);  // pass object to TwoDShape constructor.
		
		style = ob.style;
	}
	
	// Override area() for Triangle.
	double area() {
		return getWidth() * getHeight() / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
