import Unresolved.TwoDShape;

// A subclass of TwoDShape for triangles. 

public class Triangle extends TwoDShape {  // Triangle inherits TwoDShape
	
	String style;
	
	double area() {
		return (width * height) / 2 ;  // Triangle can refer to the members of TwoDShape as if they were part of Triangle.
	} 
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}

}
