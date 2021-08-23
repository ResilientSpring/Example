// All enumerations automatically have two pre-defined methods: values() and valueOf()
// values() returns an array that contains a list of the enumeration constants.
public class EnumDemo3 {

	public static void main(String[] args) {
		Transport tpTransport;
		
		System.out.println("Here are all Transport constants: ");
		
		// Use values()
		Transport allTransport[] = Transport.values();  // Obtain an array of Transport constants.
		
		for (Transport transport : allTransport) {
			System.out.println(transport);
		}

	}

}
