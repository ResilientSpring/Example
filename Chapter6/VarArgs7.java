
public class VarArgs7 {
	
	static void vaTest(int n, int ... v) {
		
		System.out.println("Contents of array v: ");
		
		for(int i = -5 ; i < v.length ; i++)
			System.out.print(v[i] + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vaTest(5);

	}

}
