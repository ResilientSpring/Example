// Use dynamic method dispatch.
public class TwoDShape11 {
	
	private double width;
	private double height;
	private String name;
	
	// A default constructor
	public TwoDShape11() {
		width = height = 0.0;
		name = "none";
	}
	
	// Parameterized constructor.
	TwoDShape11(double w, double h, String n){
		width = w;
		height = h;
		name = n;
	}
	
	// Construct object with equal width and height. 
	TwoDShape11(double x, String n){
		width = height = x;
		name = n;
	}
	
	// Construct an object from an object. 
	TwoDShape11(TwoDShape11 ob){
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
	
	double area() {  // The area() method defined by TwoDShape
		System.out.println("area() must be overridden");
		return 0.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
