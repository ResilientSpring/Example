
public class FSDemo2 {

	public static void main(String[] args) {
		
		FailSoftArray2 fsFailSoftArray2 = new FailSoftArray2(5, -1);
		int x;

		// show quiet failure
		System.out.println("Fail quietly.");
		for (int i = 0; i < (fsFailSoftArray2.length * 2); i++)
			fsFailSoftArray2.put(i, i * 10); // Need not the method's caller declare a variable to hold the value returned by the method? 

		for (int i = 0; i < (fsFailSoftArray2.length * 2); i++) {

			x = fsFailSoftArray2.get(i); 

			if (x != -1)
				System.out.print(x + " ");

		}

		System.out.println("");

		// now, handle failures
		System.out.println("\nFail with error reports.");

		for (int i = 0; i < (fsFailSoftArray2.length * 2); i++)

//			if (!fsFailSoftArray2.put(i, i * 10))
				System.out.println("Index " + i + " out-of-bounds");

		for (int i = 0; i < (fsFailSoftArray2.length * 2); i++) {
			x = fsFailSoftArray2.get(i);
			if (x != -1)
				System.out.print(x + " ");
			else
				System.out.println("Index " + i + " out-of-bounds");
		}

	}

}
