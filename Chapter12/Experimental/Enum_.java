package Experimental;

enum Transport{
	AIRPLANE, BOAT, TRAIN, CAR, TRUCK
}

public class Enum_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transport tpTransport = Transport.TRUCK;
		int defuse = 1;
		
		System.out.println(tpTransport.ordinal());
		System.out.println(defuse);
		
		System.out.println(Transport.AIRPLANE.ordinal());
//		System.out.println(Transport.AIRPLANE.ordinal(););
//		System.out.println(int defusion = 3;);
		
		System.out.println();

	}

}
