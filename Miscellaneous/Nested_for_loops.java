
public class Nested_for_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[9];
		
		int counter = 0;
		
		for(int x = 20; x < 80; x += 20) {		
			
			for(int y = 2 ; y < 8; y += 2 ) {
				
				array[counter] = x * y;
				
				counter++;
			}
			
		}
		
		System.out.println("[" + array + "]");
		
		System.out.print("[");
		
		for (int i : array) {
			System.out.print(i);
			
			if (i != 360) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");

	}

}
