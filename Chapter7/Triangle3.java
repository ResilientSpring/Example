// A subclass of TwoDShape for triangles. 
public class Triangle3 extends TwoDShape3 {
	
	String styleString;
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}

}
