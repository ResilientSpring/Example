class Summation2{
	
	int sum;
	
	// Construct from another object. 
	public Summation2(Summation ob) {
		
		sum = ob.sum;
	}
}

public class SumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Summation2 s1 = new Summation2();
		Summation2 s2 = new Summation2(s1);

	}

}
