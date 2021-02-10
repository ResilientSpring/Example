
public class Triangle6 extends TwoDShape6 {
	
	private String styleString;
	
	// A default constructor. 
	public Triangle6() {
	//	super();                              Call superclass constructor.  
		
		styleString = "none";
	}
	
	// Constructor
	Triangle6(String s, double w, double h){
	//	super(w, h);                          Use super() to call the various forms of the TwoDShape constructor.
		
		styleString = s;
	}
	
	// One argument constructor. 
	Triangle6(double x){
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
