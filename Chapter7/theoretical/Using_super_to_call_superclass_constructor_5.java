package theoretical;

class TwoDShaper_5{
	
	private double width;
	private double height;
	String title;
	
	public TwoDShaper_5(double w, double h) {
		width = w;
		height = h;
	}
	
	public TwoDShaper_5() {
		// TODO Auto-generated constructor stub
	}
	
	TwoDShaper_5(double width, double height, String title){
		
		this.width = width;
		this.height = height;
		this.title = title;
		
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
	
	String showTitle() {
		return title;
	}
	
	void showTitle_2() {
		System.out.println("Triangle is also " + title);
	}
	
}


class Triangular_5 extends TwoDShaper_5{
	
	private String style;
	
	public Triangular_5() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangular_5(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	
	Triangular_5(String style, String title, double width, double height){
		
		super(width, height, title);
		
		this.style = style;
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
	
	String showTheTitle() {
		
		return showTitle();
		
	}
	
	void showTheTitle_2() {
		System.out.println("Triangle is also " + super.title);
	}
	
}


public class Using_super_to_call_superclass_constructor_5 {

	public static void main(String[] args) {
		Triangular_5 t0 = new Triangular_5();
		Triangular_5 t1 = new Triangular_5("filled", 4.0, 4.0);
		Triangular_5 t2 = new Triangular_5("outlined", 8.0, 12.0);
		Triangular_5 t3 = new Triangular_5("Slovenly", "Classy", 8.0, 9.0);
		
		System.out.println("Info for t0: ");
		t0.showStyle();
		t0.setHeight(9);
		t0.setWidth(3);
		t0.showDim();
		t0.showTitle();
		t0.showTheTitle();
		System.out.println("Area is " + t0.area());
		
		System.out.println();
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());		
		
		System.out.println();
		
		System.out.println("Info for t3: ");
		t3.showStyle();
		t3.showDim();
		t3.showTitle_2();
		t3.showTheTitle_2();
		System.out.println("Area is " + t3.area());

	}

}
