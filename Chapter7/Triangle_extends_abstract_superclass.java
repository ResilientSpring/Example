
public class Triangle_extends_abstract_superclass extends TwoDShape_abstract {
	
	private String styleString;
	
	// A default constructor
	public Triangle_extends_abstract_superclass() {
		// TODO Auto-generated constructor stub
		super();
		
		styleString = "none";
		
	}
	
	// Constructor for Triangle
	Triangle_extends_abstract_superclass(String s, double w, double h){
		super(w, h, "triangle");
		
		styleString = s;
	}
	
	// One argument constructor.
	Triangle_extends_abstract_superclass(double x){
		super(x, "triangle");  // call superclass constructor
		
		styleString = "filled";
	}
	
	// Construct an object from an object.
	Triangle_extends_abstract_superclass(Triangle_extends_abstract_superclass ob){
		super(ob);  // pass object to TwoDShape constructor
		styleString = ob.styleString;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
