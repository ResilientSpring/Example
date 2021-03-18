
public class DemoPwr {

	public static void main(String[] args) {
		Pwr xPwr = new Pwr(4.0, 2);
		Pwr yPwr = new Pwr(2.5, 1);
		Pwr zPwr = new Pwr(5.7, 0);
		
		System.out.println(xPwr.b + " raised to the " + xPwr.e + " power is " + xPwr.get_pwr() );
		
		System.out.println(yPwr.b + " raised to the " + yPwr.e + " power is " + yPwr.get_pwr() );
		
		System.out.println(zPwr.b + " raised to the " + zPwr.e + " power is " + zPwr.get_pwr());

	}

}
