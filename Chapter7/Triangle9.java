
public class Triangle9 extends TwoDShape9 {
	
	private String styleString;
	
	// A default constructor. 
	public Triangle9() {
		super();       //                       Call superclass constructor.  
		
		styleString = "none";
	}
	
	// Constructor
	Triangle9(String s, double w, double h){
		super(w, h);         //                 Use super() to call the various forms of the TwoDShape constructor.
		
		width = w;
		height = h;
		
		styleString = s;
	}
	
	// One argument constructor. 
	Triangle9(double x){
		super(x);     //                       Use super() to construct the various forms of the TwoDShape constructor.
		styleString = "filled";
		
	}
	
	// Construct an object from an object.
	Triangle9(Triangle9 ob){
		super(ob); // pass object to TwoDShape9 constructor, i.e., pass a Triangle9 reference to TwoDShape9's constructor.
		styleString = ob.styleString;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}

}
