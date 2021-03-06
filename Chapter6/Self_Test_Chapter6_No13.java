import java.util.Scanner;

/*
 * Create a varargs method called sum() that sums the int values passed to it.
 * */

public class Self_Test_Chapter6_No13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] collection = new int[10];
		
		System.out.print("Please enter 10 integers for the program to count their average value.");
		
		for (int i = 0; i < collection.length; i++) {
			
			switch (i) {
			case 0: {
				System.out.println("Now, insert the first integer: ");
				Scanner myScanner = new Scanner(System.in);
				collection[0] = myScanner.nextInt();
				myScanner.close();
				break;
			}
			case 1: {
				System.out.println("Now, insert the No." + i + 1 + " value.");
				Scanner myScanner = new Scanner(System.in);
				collection[i] = myScanner.nextInt();
				myScanner.close();
				break;
			}
			default:
				System.out.println("Now, insert the No." + i + 1 + " value.");
				Scanner myScanner = new Scanner(System.in);
				collection[i] = myScanner.nextInt();
			}
		}
		
		sums(collection);
	}
	

	static void sums(int ... v) {
		
		
		
	}

}
