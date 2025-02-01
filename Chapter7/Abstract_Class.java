
abstract class Abstract_TwoDShape {
	
	private double width;
	private double height;
	private String name;
	
	// A default constructor
	public Abstract_TwoDShape() {
		width = height = 0.0;
		name = "none";
	}
	
	// Parameterized constructor.
	Abstract_TwoDShape(double w, double h, String n){
		width = w;
		height = h;
		name = n;
	}
	
	// Construct object with equal width and height. 
	Abstract_TwoDShape(double x, String n){
		width = height = x;
		name = n;
	}
	
	// Construct an object from an object. 
	Abstract_TwoDShape(Abstract_TwoDShape ob){
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	// Accessor methods for width and height. 
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
	
	String getName() {
		return name;
	}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	// declare an abstract method
	abstract double area();

}


class Triangle_extends_abstract_superclass2 extends Abstract_TwoDShape {
	
	private String styleString;
	
	// A default constructor
	public Triangle_extends_abstract_superclass2() {
		// TODO Auto-generated constructor stub
		super();
		
		styleString = "none";
		
	}
	
	// Constructor for Triangle
	Triangle_extends_abstract_superclass2(String s, double w, double h){
		super(w, h, "triangle");
		
		styleString = s;
	}
	
	// One argument constructor.
	Triangle_extends_abstract_superclass2(double x){
		super(x, "triangle");  // call superclass constructor
		
		styleString = "filled";
	}
	
	// Construct an object from an object.
	Triangle_extends_abstract_superclass2(Triangle_extends_abstract_superclass ob){
		super(ob);  // pass object to TwoDShape constructor
		styleString = ob.styleString;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + styleString);
	}
}


public class Abstract_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
