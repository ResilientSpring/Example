
public class value_of_3 {
	
	public static void main(String[] args) {
		
		// values() returns an array of the enumeration constants.
		Transport tpTransport[] = Transport.values();
		
		for (Transport transport : tpTransport) {
			System.out.println(transport);
		}
		
		// valueOf() returns the enumeration constant whose value corresponds to the string passed to the argument.
		System.out.println(Transport.valueOf("BOAT"));

	}

}
