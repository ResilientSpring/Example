
public class Shapes9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorTriangle t1 = new ColorTriangle("Blue", "Outlined", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();  // A ColorTriangle object can call methods defined by itself and its superclasses.
		t2.showDim();
		t2.showColor();
		System.out.println("Area is " + t2.area());

	}

}
