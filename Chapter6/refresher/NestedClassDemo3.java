package refresher;


class Outer3 {

	int nums[];

	Outer3(int n[]) {
		// TODO Auto-generated constructor stub
		nums = n;
	}

	void analyze() {
		Inner inOb = new Inner();

		System.out.println("Minimum: " + inOb.min());
		System.out.println("Maximum: " + inOb.max());
		System.out.println("Average: " + inOb.avg());
	}

	// This is an inner class.
	class Inner {
		
		int min() {
			int m = nums[0];

			for (int i = 1; i < nums.length; i++)
				if (nums[i] < m)
					m = nums[i];
			return m;
		}

		int max() {
			int m = nums[0];
			for (int i = 1; i < nums.length; i++)
				if (nums[i] > m)
					m = nums[i];

			return m;
		}

		int avg() {
			int a = 0;
			for (int i = 0; i < nums.length; i++)
				a += nums[i];

			return a / nums.length;
		}
	}
}

public class NestedClassDemo3 {

	public static void main(String[] args) {
		
		int[] x = {2, 4, 6, 8, 10};
		
		Outer3 outer3 = new Outer3(x);
		
		outer3.analyze();

	}

}
