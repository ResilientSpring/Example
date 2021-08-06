
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transport tpTransport;

		tpTransport = Transport.AIRPLANE;
		
		// Output an enumeration value.
		System.out.println("Value of tpTransport: " + tpTransport);
		
		System.out.println();
		
		tpTransport = Transport.TRAIN;

		// Compare two enum values.
		if (tpTransport == Transport.TRAIN) 
			System.out.println("tp contains TRAIN.\n");

		switch (tpTransport) {

		case CAR: 
			System.out.println("A car carries people.");
			break;

		case TRUCK:
			System.out.println("A truck carries freight.");
			break;

		case AIRPLANE:
			System.out.println("An airplane flies.");
			break;

		case TRAIN:
			System.out.println("A train runs on rails.");
			break;

		case BOAT:
			System.out.println("A boat sails on water.");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}

	}

}
