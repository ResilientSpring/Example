
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



public class Abstract_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
