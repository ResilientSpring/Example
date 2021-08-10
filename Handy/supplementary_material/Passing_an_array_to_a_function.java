package supplementary_material;

public class Passing_an_array_to_a_function {

	public static int max(int[] array) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int rock_solid[] = new int[10];
		
		for (int i = 0; i < rock_solid.length; i++) {
			rock_solid[i] = i;
		}
		
		System.out.println("The max element of the array is " + max(rock_solid));
		System.out.println("The minimum element of the array is " + min(rock_solid));
		
	}

}

// Reference: https://www.tutorialspoint.com/How-to-pass-Arrays-to-Methods-in-Java
