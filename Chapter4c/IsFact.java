
public class IsFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factor xFactor = new Factor();

		if (xFactor.isFactor(2, 20)) // Pass two arguments to isFactor().
			System.out.println("2 is factor");

		if (xFactor.isFactor(3, 20))
			System.out.println("this won't be displayed.");

	}

}
