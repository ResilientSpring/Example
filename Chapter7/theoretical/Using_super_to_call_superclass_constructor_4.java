package theoretical;


class TwoDShaper_4{
	
	private double width;
	private double height;
	private String title;
	
	public TwoDShaper_4(double w, double h) {
		// TODO Auto-generated constructor stub
	}
	
	public TwoDShaper_4() {
		// TODO Auto-generated constructor stub
	}
	
	TwoDShaper_4(double width, double height, String title){
		
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


class Triangular_4 extends TwoDShaper_4{
	
	private String style;
	
	public Triangular_4() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangular_4(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	
	Triangular_4(String style, String title, double width, double height){
		
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



public class Using_super_to_call_superclass_constructor_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangular_4 t0 = new Triangular_4();
		Triangular_4 t1 = new Triangular_4("filled", 4.0, 4.0);
		Triangular_4 t2 = new Triangular_4("outlined", 8.0, 12.0);
		Triangular_4 t3 = new Triangular_4("Slovenly", "Classy", 8.0, 9.0);
		
		System.out.println("Info for t0: ");
		t0.showStyle();
		t0.setHeight(9);
		t0.setWidth(3);
		t0.showDim();
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
		t3.showTitle();
		t3.showTheTitle();
		System.out.println("Area is " + t3.area());
	}

}
