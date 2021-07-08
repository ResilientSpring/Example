// Even though TwoDShape is a superclass for Triangle, it is also a completely independent, stand-alone class. 
public class Triangle_ extends TwoDShape {
	
	String style;
	
	double area() {
		return (width * height) / 2 ;  // Triangle can refer to the members of TwoDShape as if they were part of Triangle.
	} 
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoDShape shape = new TwoDShape();
		
		shape.height = 20;
		shape.width = 10;
		
		shape.showDim();

	}

}
