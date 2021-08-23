
public class value_of_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transport tpTransport[] = Transport.values();
		
		for (Transport transport : tpTransport) {
			System.out.println(transport);
		}
		
		System.out.println(Transport.valueOf("BOAT"));

	}

}
