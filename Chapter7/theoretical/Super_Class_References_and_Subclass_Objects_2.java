package theoretical;

class TwoDShape_3{
	
	private double width;
	private double height;
	String title;
	
	public TwoDShape_3(double w, double h) {
		width = w;
		height = h;
	}
	
	public TwoDShape_3() {
		// TODO Auto-generated constructor stub
	}
	
	TwoDShape_3(double width, double height, String title){
		
		this.width = width;
		this.height = height;
		this.title = title;
		
	}
	
	
	// Construct object from an object.
	TwoDShape_3(TwoDShape_3 ob){
		width = ob.width;
		height = ob.height;
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


class Triangle_3 extends TwoDShape_3{
	
	private String style;
	
	public Triangle_3() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle_3(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	
	Triangle_3(String style, String title, double width, double height){
		
		super(width, height, title);
		
		this.style = style;
		
	}
	
	Triangle_3(Triangle_3 ob){
		super(ob);   // Pass a Triangle reference to TwoDShape's constructor.
		
		style = ob.style;
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
		System.out.println("Triangle is also " + super.title);   // super is redundant here.
	}
	
	void showTheTitle_3() {
		System.out.println("Triangle is also " + title);
	}
	
}


public class Super_Class_References_and_Subclass_Objects_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle_3 t1 = new Triangle_3("Outlined", 8.0, 12.0);
		
		// make a copy of t1
		Triangle_3 t2 = new Triangle_3(t1);
		
		
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
