import java.io.IOException;

/*
 * To convert a lowercase letter to uppercase, subtract 32 from it.
 * 
 * Write a program that reads characters from the keyboard. Have it convert all lowercase letters to uppercase, and all 
 * uppercase letters to lowercase, displaying the result. Make no changes to any other character. Have the program stop
 * when the user enters a period. At the end, have the program display the number of case changes that have taken place. 
 * 
 * */
public class Self_Test_Chapter3_No10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int number_of_changes = 0;
		byte[] b = new byte[100];
		
		System.out.print("Input a roll of characters and the program will convert all lowercase letters to uppercase");
		System.out.print(", and vice versa.  \nPlease input: ");
		
		System.in.read(b);
		
		for (int i = 0; i < b.length; i++) {
			
			if(b[i] >= 65 && b[i] <= 90) {
				
				b[i] = (byte) (b[i] + 32);
				
				number_of_changes++;
			} 
			else if(b[i] >= 97 && b[i] <= 122) {
				
				b[i] = (byte) (b[i] - 32);
				
				number_of_changes++;
			}
		}
		
		System.out.print("The roll of characters are: \n");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print( (char) b[i] + " ");
			
			if(b[i] == 46) break;
		}
		
		System.out.println();
		System.out.println("The number of case changes that have taken place: " + number_of_changes);

	}

}
