// Using super to overcome name hiding. 
public class A {
	
	int i ;

}

class B extends A {
	
	int i; // this i hides the i in A. 
	
	public B(int a, int b) {
		
		super.i = a ;   // Here, super.i refers to the i in A.
		i = b ;         // i in B
	}
	
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}
