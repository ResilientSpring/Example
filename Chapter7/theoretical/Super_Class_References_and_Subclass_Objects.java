package theoretical;

class TwoDShape_2{
	
	private double width;
	private double height;
	String title;
	
	public TwoDShape_2(double w, double h) {
		width = w;
		height = h;
	}
	
	public TwoDShape_2() {
		// TODO Auto-generated constructor stub
	}
	
	TwoDShape_2(double width, double height, String title){
		
		this.width = width;
		this.height = height;
		this.title = title;
		
	}
	
	
	// Construct object from an object.
	TwoDShape_2(TwoDShape_2 ob){
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


class Triangle_2 extends TwoDShape_2{
	
	private String style;
	
	public Triangle_2() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle_2(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	
	Triangle_2(String style, String title, double width, double height){
		
		super(width, height, title);
		
		this.style = style;
		
	}
	
	Triangle_2(Triangle_2 ob){
		
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


public class Super_Class_References_and_Subclass_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
