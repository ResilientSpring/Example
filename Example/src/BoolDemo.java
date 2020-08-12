// Demonstrate boolean values. 
public abstract class BoolDemo {

	public BoolDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b;
		
		b = false; 
		System.out.println("b is " + b);
		b = true; 
		System.out.println("b is " + b);
		
		// a boolean value can control the if statement. 
		if (b) System.out.println("This is executed."); 
		
		b = false;
		if(b) System.out.println("This is not executed. "); 
		
		// Outcome of a relational operator is a boolean value. 
		System.out.println("10 > 9 is " + (10 > 9)); 
	}
}
