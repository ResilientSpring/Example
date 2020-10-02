import java.io.IOException;

/*
 * Try This 3-3 
 * 
 * The finished Java statement Help system that processes multiple requests. 
 * 
 * */

public class Help3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char choice, ignore;
		
		// The program loops until the letter q is pressed. 
		for (;;) {

			do {
				
				// Display a menu				
				System.out.println("Help on:");
				System.out.println(" 1. if");
				System.out.println(" 2. switch");
				System.out.println(" 3. for");
				System.out.println(" 4. while");
				System.out.println(" 5. do-while");
				System.out.println(" 6. break");
				System.out.println(" 7. continue\n");
				System.out.print("Choose one (q to quit): ");

				// Input the user's choice
				choice = (char) System.in.read();

				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');

			} while (choice < '1' | choice > '7' & choice != 'q'); // Check for a valid response. 

			// Check for a valid response 
			if (choice == 'q')
				break;

			System.out.println("\n");

			// Display information about the item selected.
			switch (choice) {
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println("  case constant:");
				System.out.println("    statement sequence");
				System.out.println("    break;");
				System.out.println("  // ...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("The for:\n");
				System.out.print("for(init; condition; iteration)");
				System.out.println(" statement;");
				break;
			case '4':
				System.out.println("The while:\n");
				System.out.println("while(condition) statement;");
				break;
			case '5':
				System.out.println("The do-while:\n");
				System.out.println("do {");
				System.out.println(" statement;");
				System.out.println("} while (condition);");
				break;
			case '6':
				System.out.println("The break:\n");
				System.out.println("break; or break label;");
				break;
			case '7':
				System.out.println("The continue:\n");
				System.out.println("continue; or continue label;");
				break;
			}
			
			System.out.println();

		}

	}

}
