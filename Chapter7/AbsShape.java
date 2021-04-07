
public class AbsShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoDShape_abstract shapes[] = new TwoDShape_abstract[4];
		
		shapes[0] = new Triangle_extends_abstract_superclass("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle_extends_abstract_superclass(10);
		shapes[2] = new Rectangle_extends_abstract_superclass(10, 4);
		shapes[3] = new Triangle_extends_abstract_superclass(7.0);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			
			System.out.println();
		}

	}

}
