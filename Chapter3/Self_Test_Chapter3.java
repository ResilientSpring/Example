import java.io.IOException;

public class Self_Test_Chapter3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char input, ignore;
		int count = 0;
		
		System.out.println("Please enter something until you enter period.");

		for (;;) {

			input = (char) System.in.read();
			
			// discard any other characters in the input buffer
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			
			count++;

			if (input == 46)
				break;

		}
		
		System.out.println(count);

	}

}
