
public class Shapes10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle9 t1 = new Triangle9("outlined", 8.0, 12.0);
		
		// make a copy of t1.
		Triangle9 t2 = new Triangle9(t1);
		
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
