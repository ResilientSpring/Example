
public class Passing_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t[] = new int[10];
		
		for (int i = 0; i < t.length; i++) 
			t[i] = i;
		
		for (int i : t) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n===================================================");

	}
	
	static void display(int complex[]) {
		for (int i = 0; i < complex.length; i++) {
			System.out.print(complex[i] + " ");
		}
	}

}
