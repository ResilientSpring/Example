
// Demonstrate the fail-soft array. 
class FSDemo {

	public static void main(String arg[]) {

		FailSoftArray fsFailSoftArray = new FailSoftArray(5, -1);
		int x;

		// show quiet failure
		System.out.println("Fail quietly.");
		for (int i = 0; i < (fsFailSoftArray.length * 2); i++)
			fsFailSoftArray.put(i, i * 10); // Access to array must be through its accessor methods.

		for (int i = 0; i < (fsFailSoftArray.length * 2); i++) {

			x = fsFailSoftArray.get(i); // Access to array must be through its accessor methods.

			if (x != -1)
				System.out.print(x + " ");

		}

		System.out.println("");

		// now, handle failures
		System.out.println("\nFail with error reports.");

		for (int i = 0; i < (fsFailSoftArray.length * 2); i++)

			if (!fsFailSoftArray.put(i, i * 10))
				System.out.println("Index " + i + " out-of-bounds");

		for (int i = 0; i < (fsFailSoftArray.length * 2); i++) {
			x = fsFailSoftArray.get(i);
			if (x != -1)
				System.out.print(x + " ");
			else
				System.out.println("Index " + i + " out-of-bounds");
		}

	}

}
