// This example will not compile. 
public class Triangle2 {
	
	String style;
	
	double area() {
		return width * height / 2;  // Can't access a private member of a superclass. 
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}

}
