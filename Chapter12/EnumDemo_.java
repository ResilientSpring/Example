
public class EnumDemo_ {
	public static void main(String[] args) {

		int i;
		
		i = 10;

		System.out.println("Value of i: " + i);

		System.out.println();

		i = 2;

		if (i == 2) 
			System.out.println("i contains 2.\n");

		switch (i) {
		case 2:
			System.out.println("A boat sails on water.");
			break;
		case 4:
			System.out.println("A truck carries freight.");
			break;
		case 6:
			System.out.println("An airplane flies.");
			break;
		case 8:
			System.out.println("Smooth sailing.");
			break;
		case 10:
			System.out.println("Freight trains.");
			break;
		default:
			break;
		}

	}
}
