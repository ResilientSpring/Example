
public abstract class TwoDShape_abstract {
	
	private double width;
	private double height;
	private String name;
	
	// A default constructor
	public TwoDShape_abstract() {
		width = height = 0.0;
		name = "none";
	}
	
	// Parameterized constructor.
	TwoDShape_abstract(double w, double h, String n){
		width = w;
		height = h;
		name = n;
	}
	
	// Construct object with equal width and height. 
	TwoDShape_abstract(double x, String n){
		width = height = x;
		name = n;
	}
	
	// Construct an object from an object. 
	TwoDShape_abstract(TwoDShape_abstract ob){
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
