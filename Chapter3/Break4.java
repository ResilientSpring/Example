// Using break with a label.
public class Break4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 0; i < 4; i++) {
			one: {
				two: {
					three: {

						System.out.println("\ni is " + i);
						if (i == 1)
							break one; // Break to a label.
						if (i == 2)
							break two;
						if (i == 3)
							break three;

						// this is never reached
						System.out.println("won't print");

					}
					System.out.println("After block three.");
				}
				System.out.println("After block two.");
			}
			System.out.println("After block one.");

		}
		System.out.println("After for.");

	}

}
