
class Prudential {

	int x;
	static int y;

}

public class Self_Test_Chapter6_No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prudential controlPrudential = new Prudential();
		Prudential experimentPrudential = new Prudential();

		controlPrudential.x = 12;
		experimentPrudential.x = 34;

		System.out.println("The member variable x of control and experiment objects of class Prudential are "
				+ controlPrudential.x + " and " + experimentPrudential.x + ", respectively. \n");

		controlPrudential.y = 56;
		experimentPrudential.y = 78;

		System.out
				.println("The static member variable y of control" + " and experiment objects of class Prudential are "
						+ controlPrudential.y + " and " + experimentPrudential.y + ", respectively.");

	}

}
