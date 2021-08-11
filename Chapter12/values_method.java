// values() is a pre-defined static method of enumeration.
public class values_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transport allTransport[] = Transport.values();
		
		for (Transport transport : allTransport) {
			System.out.println(transport);
		}

	}

}
