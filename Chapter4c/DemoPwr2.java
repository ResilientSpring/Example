
public class DemoPwr2 {

	public static void main(String[] args) {
		Pwr2 xPwr2 = new Pwr2(4.0, 2);
		Pwr2 yPwr2 = new Pwr2(2.5, 1);
		Pwr2 zPwr2 = new Pwr2(5.7, 0);
		
		System.out.println(xPwr2.b + " raised to the " + xPwr2.e + " power is " + xPwr2.get_pwr() );
		
		System.out.println(yPwr2.b + " raised to the " + yPwr2.e + " power is " + yPwr2.get_pwr() );
		
		System.out.println(zPwr2.b + " raised to the " + zPwr2.e + " power is " + zPwr2.get_pwr() );

	}

}
