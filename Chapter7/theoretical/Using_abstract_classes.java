package theoretical;

class TwoDShape{
	private double width;
	private double height;
	private String name;
	
	public TwoDShape() {
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShape(double w, double h, String n){
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape(double x, String n){
		width = height = x;
		name = n;
	}
	
	TwoDShape(TwoDShape ob){
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
}

public class Using_abstract_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
