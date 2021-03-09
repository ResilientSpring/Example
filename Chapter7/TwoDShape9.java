
public class TwoDShape9 {
	
	double width; 
	double height; 
	
	// A default constructor
	public TwoDShape9() {
		
		width = height = 0.0;
	}
	
	// Parameterized constructor. 
	TwoDShape9(double w, double h){
		width = w;
		height = h;
	}
	
	// Construct object with equal width and height.
	TwoDShape9(double x){
		width = height = x;
	}
	
	// Construct an object from an object.
	TwoDShape9(TwoDShape9 ob){
		width = ob.width;
		height = ob.height;
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
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}

}
