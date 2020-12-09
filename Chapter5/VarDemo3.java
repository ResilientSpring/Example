// Use type inference in a for loop.
public class VarDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Use type inference with the loop control variable.
		System.out.print("Values of x: ");

		for (var x = 2.5; x < 100.0; x = x * 2) // Use var in a far loop.
			System.out.print(x + " ");

		System.out.println();

		// Use type inference with the iteration variable.
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		System.out.print("Values in nums array: ");
		for (var v : nums) // Use var in a for loop.
			System.out.print(v + " ");

		System.out.println();

	}

}
