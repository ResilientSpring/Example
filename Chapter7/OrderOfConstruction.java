// Demonstrate when constructors are executed. 

// Create a super class. 
class A2{
	public A2() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructing A2.");
	}
}

// Create a subclass by extending class A2.
class B2 extends A2{
	public B2() {
		System.out.println("Constructing B2.");
	}
}

// Create another subclass by extending B2.
class C2 extends B2{
	public C2() {
		System.out.println("Constructing C2.");
	}
}

public class OrderOfConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C2 c2 = new C2();

	}

}
