// ColorTriangle inherits Triangle7 which is descended from TwoDShape, so ColorTriangle includes all members of Triangle7
// and TwoDShape.

public class ColorTriangle extends Triangle7 {
	
	private String colorString;
	
	public ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h);
		
		colorString = c;
	}
	
	String getColor() {
		return colorString;
	}
	
	void showColor() {
		System.out.println("Color is " + colorString);
	}

}
