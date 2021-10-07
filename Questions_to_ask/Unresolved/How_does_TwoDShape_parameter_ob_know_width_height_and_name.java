package Unresolved;

class TwoDShape {
	private double width;
	private double height;
	private String name;

	public TwoDShape() {
		width = height = 0.0;
		name = "none";
	}

	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}

	TwoDShape(TwoDShape ob) {
		width = ob.width; // How does TwoDShape parameter ob know width, height, and name without using the keyword new?
		height = ob.height;
		name = ob.name;
	}
}

public class How_does_TwoDShape_parameter_ob_know_width_height_and_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
