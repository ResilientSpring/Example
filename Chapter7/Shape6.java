
public class Shape6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle6 t1 = new Triangle6();

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		Triangle6 t2 = new Triangle6("Good", 5.3, 2.0);
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());

	}

}
