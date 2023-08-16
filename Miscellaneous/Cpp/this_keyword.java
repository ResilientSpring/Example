package Cpp;

import org.jcp.xml.dsig.internal.MacOutputStream;

class Function_that_returns_objects{
	
	int value;
	
	public Function_that_returns_objects(int value) {
		
		this.value = value;
		
		System.out.println("Inside constructors \n");
	}
	
	
	int get_value() {
		return value;
	}
	
	
	// Return an object.
	Function_that_returns_objects mkBigger() {
		
		Function_that_returns_objects object = new Function_that_returns_objects(value * 2);
		
		return object;
		
	}
	
	static void display(Function_that_returns_objects ob) {
		
		System.out.println(ob.get_value());
		
	}
	
}



public class this_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before constructing a.");
		
		Function_that_returns_objects a = new Function_that_returns_objects(10);
		
		System.out.println("After constructing a.");
		
		System.out.println();
		
		System.out.println("Before call to display().");
		
		Function_that_returns_objects.display(a);
		
		System.out.println("After display() returns.");
		
		System.out.println();
		
		System.out.println("Before call to mkBigger().");
		
		System.out.println();
		
		a = a.mkBigger();
		
		System.out.println("After mkBigger() returns.");
		
		System.out.println();
		
		System.out.println("Before the second call to display().");
		
		Function_that_returns_objects.display(a);
		
		System.out.println("After display() returns.");
		
		System.out.println();		

	}

}
