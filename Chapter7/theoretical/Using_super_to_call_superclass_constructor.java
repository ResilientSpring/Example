package theoretical;

class TwoDShaper{
	
	private double width;
	private double height;
	
	public TwoDShaper(double w, double h) {
		// TODO Auto-generated constructor stub
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
	
}


class Triangular extends TwoDShaper{
	
	private String style;
	
	public Triangular(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
}

public class Using_super_to_call_superclass_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
