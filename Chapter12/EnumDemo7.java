
public class EnumDemo7 {

	public static void main(String[] args) {
		
		// System can directly print out either numeric constants or named constants.
		for (Transport transport : Transport.values()) {
			System.out.println(transport);
		}

	}

}
