package Cpp;

class Function_that_returns_objects_2{
	
	int value;
	
	public Function_that_returns_objects_2(int value) {
		
		this.value = value;
		
		System.out.println("Inside constructors \n");
	}
	
	
	int get_value() {
		return value;
	}
	
	
	// Return an object.
	Function_that_returns_objects_2 mkBigger() {
		
		Function_that_returns_objects_2 object = new Function_that_returns_objects_2(value * 2);
		
		return object;
		
	}
	
}



void display(Function_that_returns_objects_2 ob) {
	
	System.out.println(ob.get_value());
	
}



public class this_keyword_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
