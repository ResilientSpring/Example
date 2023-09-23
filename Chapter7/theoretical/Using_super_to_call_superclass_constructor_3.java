package theoretical;


class TwoDShaper_3{
	
	private double width;
	private double height;
	private String title;
	
	public TwoDShaper_3(double w, double h) {
		// TODO Auto-generated constructor stub
	}
	
	public TwoDShaper_3() {
		// TODO Auto-generated constructor stub
	}
	
	TwoDShaper_3(double width, double height, String title){
		
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
	
}



class Triangular_3 extends TwoDShaper_3{
	
	private String style;
	
	public Triangular_3() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangular_3(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	
	Triangular_3(String style, String title, double width, double height){
		
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
	
}



public class Using_super_to_call_superclass_constructor_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangular_3 t1 = new Triangular_3("filled", 4.0, 4.0);
		Triangular_3 t2 = new Triangular_3("outlined", 8.0, 12.0);
		Triangular_3 t3 = new Triangular_3("Slovenly", "Classy", 8.0, 9.0);
		
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
		t3.showTitle();
		t3.showTheTitle();
		System.out.println("Area is " + t3.area());

	}

}
