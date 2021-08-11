// Use the built-in enumeration methods.
public class EnumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transport tp;
		
		System.out.println("Here are all Transport constants: ");
		
		// Use values()
		Transport allTransport[] = Transport.values();  // Obtain an array of Transport constants.
		
		for (Transport transport : allTransport) {
			System.out.println(transport);
		}

	}

}
