
public class Triangle6 extends TwoDShape6 {
	
	private String styleString;
	
	// A default constructor. 
	public Triangle6() {
	//	super();
		
		styleString = "none";
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}

}
