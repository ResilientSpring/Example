import java.util.Scanner;

public class Guess5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch, answer='K';
		
		System.out.println("I am thinking of a letter between A and Z. ");
		System.out.print("Can you guess it: ");
		
		
		Scanner myObjScanner = new Scanner(System.in);
		ch =   (char) myObjScanner.nextInt();
		
		if (ch == answer) System.out.print("** Right **");
		else { 
			System.out.print("...Sorry, you're ");
			
			if(ch > answer) System.out.print("too high.");
			else System.out.print("too low.");
		
		}
	}

}
