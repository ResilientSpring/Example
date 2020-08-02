/*
 * Use the Pythagorean theorem to find the length of the hypotenuse
 * given the lengths of the two opposing sides. 
 * */

public class Hypot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, z;
		
		//a2+b2=c2; c = square_root_of (a2+b2)
		
		//x2+y2=z2; z = square_root_of (x2+y2)
		
		x = 3; 
		y = 4; 
		z = Math.sqrt(x*x + y*y); // Notice how sqrt() is called. It is preceded by the name of the class of which it is a member.
		
		System.out.println("Hypotenuse is " + z); 
	}

}
