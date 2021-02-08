// A subclass of TwoDShape3 for triangles. 
public class Triangle4 extends TwoDShape3 {
	
	private String styleString;
	
	// Constructor
	public Triangle4(String s, double w, double h) {
		// TODO Auto-generated constructor stub
		
		setWidth(w);    // initialize TwoDShape3 portion of object. 
		setHeight(h);   // initialize TwoDShape3 portion of object.
		
		styleString = s;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}

}
