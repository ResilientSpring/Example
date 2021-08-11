
public class EnumDemo3 {

	public static void main(String[] args) {
//		Transport tp;
		
		System.out.println("Here are all Transport constants: ");
		
		// Use values()
		Transport allTransport[] = Transport.values();  // Obtain an array of Transport constants.
		
		for (Transport transport : allTransport) {
			System.out.println(transport);
		}

	}

}
