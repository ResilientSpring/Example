import java.util.Scanner;

public class Hypotenuse {

	public Hypotenuse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x, y, z; 
		
		Scanner myObj = new Scanner (System.in); 
		System.out.println("Please insert the length of one opposing side of the hypotenuse: ");		
		x = myObj.nextDouble();
		
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Please insert the length of the other opposing side of the hypotenuse: ");
		y = myObj2.nextDouble();
		
		z = Math.sqrt(x*x + y*y);
		
		System.out.println("Hypotenuse: is " + z);

	}

}
