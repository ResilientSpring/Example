package Final;

public class switching {

	public static void main(String[] args) {
		
		int i;
		i = 10;
		
		if (i == 25) {
			System.out.println("10 contains 25.");
		}
		
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

		default:
			break;
		}

	}

}
