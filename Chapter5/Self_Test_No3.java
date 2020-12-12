// Write a program that uses an array to find the avverage of 10 double values. Use any 10 values you like.
public class Self_Test_No3 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		double[] doubleArray = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for (double d : doubleArray) {
			
			sum = sum + d;
		}
		
		System.out.println("The average of doubleArray is: " + sum/10);

	}

}
