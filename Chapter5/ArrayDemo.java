import java.awt.image.SampleModel;

// Demonstrate a one dimensional array.
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sameple[] = new int[10];
		int i;
		
		for (i = 0;  i< 10; i++) {
			sameple[i] = i;
			
		}
		
		for (i = 0;  i< 10; i++) {
			System.out.println("This is sample[" + i + "]: " + sameple[i] ); 
			
		}

	}

}
