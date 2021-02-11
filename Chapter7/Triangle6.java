
public class Triangle6 extends TwoDShape6 {
	
	private String styleString;
	
	// A default constructor. 
	public Triangle6() {
	//	super();                              Call superclass constructor.  
		
		styleString = "none";
	}
	
	/*
	 * If a constructor does not explicitly invoke a superclass constructor, 
	 * the Java compiler automatically inserts a call to the no-argument constructor of the superclass. 
	 * If the super class does not have a no-argument constructor, you will get a compile-time error.
	
	References: 
	https://web.archive.org/web/20210118184134/https://docs.oracle.com/javase/tutorial/java/IandI/super.html
	
	*/
	
	// Constructor
	Triangle6(String s, double w, double h){
	//	super(w, h);                          Use super() to call the various forms of the TwoDShape constructor.
		
	//	width = w;
		
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
