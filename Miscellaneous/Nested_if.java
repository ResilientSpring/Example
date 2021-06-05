
public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[100];
		
		for(int i = 0; i < 100; i++) {
			array[i] = i;
		}
		
		System.out.print("[");
		
		for (int i : array) {
			System.out.print(i);
			
			if (i != 99) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
		
		System.out.println();
		
		System.out.print("[");
		
		for (int i : array) {
			if (i % 3 == 0) {
				System.out.print(i);
				
				if (i != 99) {
					System.out.print(", ");
				}
			}
		}
		
		System.out.print("]");

	}

}
