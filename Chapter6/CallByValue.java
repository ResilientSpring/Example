// Primitive types are passed by value. 

class Test{
	// This method causes no change to the arguments used in the call. 
	
	void noChange(int i, int j) {
		i = i + j; 
		j = - j ;
	}
}


public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obTest = new Test();
		
		int a = 15, b = 20;
		System.out.println("a and b before call: " + a + " " + b);
		
		obTest.noChange(a, b);
		
		System.out.println("a and b after call: " + a + " " + b);

	}

}
