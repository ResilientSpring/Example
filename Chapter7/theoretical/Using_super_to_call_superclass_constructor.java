package theoretical;

class TwoDShaper{
	
	private double width;
	private double height;
	
	public TwoDShaper(double w, double h) {
		// TODO Auto-generated constructor stub
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double w) {
		width = w;
	}
	
	void setHeight(double h) {
		height = h;
	}
	
	void showDim() {
		
		System.out.println("Width and height are " + width + " and " + height);
	}
	
}


class Triangular extends TwoDShaper{
	
	private String style;
	
	public Triangular(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

public class Using_super_to_call_superclass_constructor {

	public static void main(String[] args) {
		
		Triangular t1 = new Triangular("filled", 4.0, 4.0);
		Triangular t2 = new Triangular("outlined", 8.0, 12.0);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());		

	}

}
