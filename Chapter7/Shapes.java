
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width = 4.0;
		t1.height = 4.0; // All members of Triangle are available to Triangle objects, even those inherited from TwoDShape.
		t1.style = "filled";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "outlined";
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());

	}

}
