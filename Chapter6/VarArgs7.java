
public class VarArgs7 {
	
	static void vaTest(int n, int ... v) {   // Parameters of a method are essentially "variables" that receive the value of arguments passed to the method when it is called. See Textbook page 140. 
		
		System.out.println("Contents of array v: ");
		
		for(int i = -5 ; i < v.length ; i++)
			System.out.print(v[i] + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vaTest(5);

	}

}
