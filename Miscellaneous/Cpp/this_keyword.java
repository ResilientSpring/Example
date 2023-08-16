package Cpp;

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

	}

}
