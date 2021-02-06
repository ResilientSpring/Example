
public class Shapes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle3 t1 = new Triangle3();
		Triangle3 t2 = new Triangle3();
		
		t1.setWidth(4.0);
		t2.setHeight(4.0);
		t1.styleString = "filled";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.styleString = "outlined";
		
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
