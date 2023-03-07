// A subclass of TwoDshape for Triangles. 
public class Triangle5 extends TwoDShape5 {
	
	private String styleString;

	public Triangle5(String s, double w, double h) {
		super(w, h);   // Use super() to build the TwoDShape5 constructor. 
		
		
		styleString = s;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}

}
