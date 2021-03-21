
public class DynShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoDShape11 shapes[] = new TwoDShape11[5];
		
		shapes[0] = new Triangle11("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle11(10);
		shapes[2] = new Rectangle11(10, 4);
		shapes[3] = new Triangle11(7.0);
		shapes[4] = new TwoDShape11(10, 20, "generic");
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());//The proper version of area() is called for each shape.
		}

	}

}
