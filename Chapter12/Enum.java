// Demonstrate ordinal() and compareTo()
// An enumeration of Transport varieties.

enum Transport_{
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT;
}

public class Enum {

	public static void main(String[] args) {
		Transport_ tp, tp2, tp3;
		
		// Obtain all ordinal values using ordinal()
		System.out.println("Here are all Transport_ constants " + "and their ordinal values: ");
		
		for (Transport_ defuse : Transport_.values()) {
			System.out.println(defuse + " " + defuse.ordinal()); // Obtain ordinal values.
		}
		
		tp = Transport_.AIRPLANE;
		tp2 = Transport_.TRAIN;
		tp3 = Transport_.AIRPLANE;
		
		System.out.println();
		
		// Demonstrate compareTo()
		if (tp.compareTo(tp2) < 0) {
			System.out.println(tp + " comes before " + tp2);
		}
		
		if (tp.compareTo(tp2) > 0) {
			System.out.println(tp2 + " comes before " + tp);
		}
		
		if (tp.compareTo(tp3) == 0) {
			System.out.println(tp + " equals " + tp3);
		}

	}

}
