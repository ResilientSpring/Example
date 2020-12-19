// Public vs private access. 

class MyClass4{
	
	private int alpha; // private access
	public int beta;  // public access
	int gamma;       // default access
	
	/* Methods to access alpha. It is OK for a member of a class to access a private member of the same class.*/
	void setAlpha(int a) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
	
}


public class AccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass4 obClass = new MyClass4();
		
		/*Access to alpha is allowed only through its accessor methods.*/
		obClass.setAlpha(-99);
		System.out.println("obClass.alpha is " + obClass.getAlpha());
		
		// You cannot access alpha like this:
		// obClass.alpha = 10;
		
		// These are ok because beta and gamma are public. 
		obClass.beta = 88;
		obClass.gamma = 99;

	}

}
