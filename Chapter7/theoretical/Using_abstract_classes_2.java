package theoretical;

abstract class TwoDShapes{
	
	private double width;
	private double height;
	private String name;
	
	public TwoDShapes() {
		
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShapes(double w, double h, String n){
		width = w; 
		height = h;
		name = n;
	}
	
	TwoDShapes(double x, String n){
		width = height = x;
		name = n;
	}
	
	// Construct an object from an object.
	TwoDShapes(TwoDShapes ob){
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {return height;}
	void setWidth(double w) { width = w;}
	void setHeight(double h) {height = h;}
	String getName() {return name;}
	void showDimension() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	// Now, area() is abstract.
	abstract double area();
}


class Triangle extends TwoDShapes{
	
	private String style;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
		super();
		style = "none";
	}
	
}


public class Using_abstract_classes_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
