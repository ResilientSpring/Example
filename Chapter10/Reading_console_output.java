import java.io.IOException;

public class Reading_console_output {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		byte data[] = new byte[10];
		
		System.out.println("Enter some characters:");
		System.in.read(data);
		System.out.print("You entered: ");
		
		for (int i = 0; i < data.length; i++) 
			System.out.print((char) data[i]);
		
	}

}
