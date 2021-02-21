import java.io.IOException;

/*
 * Write a program that reads characters from the keyboard until a period is received. 
 * 
 * Have the program count the number of spaces. Report the total at the end of the program. 
 * 
 * */
public class Self_Test_Chapter3_No1 {

	public static void main(String[] args) throws IOException {
		
		int number_of_space = 0;
		
		System.out.println("The program will read characters until a period is received. \nPlease input: ");
		
		byte[] b = new byte[50];
		
		System.in.read(b);
		
		System.out.println("Your input were: ");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print( (char) b[i]);
			
			if(b[i] == 32) number_of_space++;
			
			if(b[i] == 46) break;
		}
		
		System.out.println();
		
		System.out.println("The number of space is: " + number_of_space);
	}
}
