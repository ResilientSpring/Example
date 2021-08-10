
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] array_of_double = new double[10];
		
//		array_of_double = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
		
		int[] array_of_integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		array_of_double[0] = 0.1;
		array_of_double[1] = 0.2;
		array_of_double[2] = 0.3;
		array_of_double[3] = 0.4;
		array_of_double[4] = 0.5;
		array_of_double[5] = 0.6;
		array_of_double[6] = 0.7;
		array_of_double[7] = 0.8;
		array_of_double[8] = 0.9;
		
		System.out.println(array_of_integers);
		System.out.println(array_of_double);
		
		for (int i : array_of_integers) {
			System.out.println(i);
		}
		
		for (double i : array_of_double) {
			System.out.println(i);
		}
		
		System.out.println("Initial value of each element in array_of_double is " + array_of_double[9]);

	}

}
