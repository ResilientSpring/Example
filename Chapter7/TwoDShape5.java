// Add constructor to TwoDShape
public class TwoDShape5 {
	
	private double width; 
	private double height; 
	
	// Parameterized constructor.
	public TwoDShape5(double w, double h) {
		// TODO Auto-generated constructor stub
		
		width = w; 
		height = h;
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
