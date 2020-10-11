// Demonstrate an array overturn.
public class ArrayErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sample[] = new int[10];
		
		int i;
		
		// Generate an array overrun. 
		// As soon as i reaches 10, an ArrayIndexOutOfBoundException is generated and the program is terminated.
		for (i = 0 ; i < 100 ; i++) sample[i] = i;

	}

}
