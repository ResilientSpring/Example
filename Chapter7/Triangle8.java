
public class Triangle8 extends TwoDShape8 {
	
	private String styleString;
	
	// A default constructor. 
	public Triangle8() {
	//	super();                              Call superclass constructor.  
		
		styleString = "none";
	}
	
	// Constructor
	Triangle8(String s, double w, double h){
	//	super(w, h);                          Use super() to call the various forms of the TwoDShape constructor.
		
		width = w;
		height = h;
		
		styleString = s;
	}
	
	// One argument constructor. 
	Triangle8(double x){
	//	super(x);                            Use super() to construct the various forms of the TwoDShape constructor.
		styleString = "filled";
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}

}
