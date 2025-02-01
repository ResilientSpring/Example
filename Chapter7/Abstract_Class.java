
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
	Triangle_extends_abstract_superclass2(Triangle_extends_abstract_superclass2 ob){
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


class Rectangle_extends_abstract_superclass2 extends Abstract_TwoDShape {
	
	// A default constructor
	public Rectangle_extends_abstract_superclass2() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	// Constructor for Rectangle
	Rectangle_extends_abstract_superclass2(double w, double h){
		super(w, h, "rectangle");  // Call superclass constructor
	}
	
	// Construct a square
	Rectangle_extends_abstract_superclass2(double x) {
		super(x, "rectangle");  // call superclass constructor
	}
	
	// Construct an object from an object. 
	Rectangle_extends_abstract_superclass2(Rectangle_extends_abstract_superclass2 ob){
		super(ob); // pass object to TwoDShape constructor.
	}
	
	boolean isSquare() {
		
		if ( getWidth() == getHeight() )
			return true;
		
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}

}

public class Abstract_Class {

	public static void main(String[] args) {
		
		Abstract_TwoDShape shapes[] = new Abstract_TwoDShape[4];
		
		shapes[0] = new Triangle_extends_abstract_superclass2("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle_extends_abstract_superclass2(10);
		shapes[2] = new Rectangle_extends_abstract_superclass2(10, 4);
		shapes[3] = new Triangle_extends_abstract_superclass2(7.0);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			
			System.out.println();
		}

	}

}
