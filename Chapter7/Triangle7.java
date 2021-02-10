
public class Triangle7 extends TwoDShape7 {
	
	private String styleString;
	
	// A default constructor. 
	public Triangle7() {
		super();                            //  Call superclass constructor.  
		
		styleString = "none";
	}
	
	// Constructor
	Triangle7(String s, double w, double h){
		super(w, h);                         // Use super() to call the various forms of the TwoDShape constructor.
		
		styleString = s;
	}
	
	// One argument constructor. 
	Triangle7(double x){
		super(x);                           // Use super() to construct the various forms of the TwoDShape constructor. 
		
		styleString = "filled";
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}

}
