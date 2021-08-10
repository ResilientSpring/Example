
public class Triangle2_ extends TwoDShape2 {
	
	String styleString;
	
	double area() {
		return width * height / 2;  
	}
	
	void show() {
		System.out.println("Triangle is " + styleString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
