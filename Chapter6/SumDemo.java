// Initialize one object with another. 

class Summation{
	
	int sum;
	
	// Construct from an int. 
	public Summation(int num) {
			
		sum= 0;
		for(int i = 1; i <= num; i++)
			sum += i; 
	}
	
	// Construct from another object. 
	public Summation(Summation ob) {
		
		sum = ob.sum;
	}
}

public class SumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summation s1 = new Summation(5);
		Summation s2 = new Summation(s1);
		
		System.out.println();
	}

}
