// Source: https://stackoverflow.com/questions/32948425/how-to-read-int-double-and-sentence-of-string-using-same-scanner-variable

import java.util.Scanner;

public class Read_multiple_types_with_one_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scan = new Scanner(System.in);
	    int i = scan.nextInt();
	    double d = scan.nextDouble();

	    scan.nextLine();
	    String s = scan.nextLine();

	    System.out.println("String: " + s);
	    System.out.println("Double: " + d);
	    System.out.println("Int: " + i);
	}

}
