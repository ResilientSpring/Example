
public class EnumDemo4 {
	
	public static void main(String[] args) {
		Transport tp = Transport.AIRPLANE;
		
		System.out.println("Here are all Transport constants: ");
		
		// Use values()
		Transport allTransport[] = tp.values();  // Obtain an array of Transport constants.
		
		for (Transport transport : allTransport) {
			System.out.println(transport);
		}

	}

}
