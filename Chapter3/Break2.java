import java.io.IOException;

// Read input until a q is received.
public class Break2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char ch;
		
		for( ; ; ) {    // This "infinite" loop is terminated by the break.
			ch = (char) System.in.read(); // get a char
			if(ch == 'q') break;  
		}
		
		System.out.println("You pressed q!");

	}

}
