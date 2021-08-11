// Use the built-in enumeration static methods.
public class EnumDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transport tpTransport;
		
		System.out.println("Here are all Transport constants.");
		
		// use values()
		Transport allTransport[] = Transport.values();
		
		for (Transport transport : allTransport) {
			System.out.println(transport);
		}
		
		System.out.println();
		
		// use valueOf()
		tpTransport = Transport.valueOf("CAR");
		System.out.println("tpTransport contains " + tpTransport);

	}

}
