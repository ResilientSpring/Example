import java.io.IOException;

public class Reading_console_output {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		byte data[] = new byte[10];
		
		System.out.println("Enter some characters.");
		System.in.read(data);

	}

}
