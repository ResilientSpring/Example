package Using_class_type_as_parameters_to_methods;

class TwoDShape{
	private double width;
	private double height;
	private String name;
	
	public TwoDShape() {
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShape(double w, double h, String n){
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape(double x, String n){
		width = height = x;
		name = n;
	}
	
	TwoDShape(TwoDShape ob){
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
}

public class A_variable_of_a_class_type {

	public static void main(String[] args) {
		
		// Declaring a variable of the class type does not define an object. Instead, it is simply a variable that can 
		// hold the memory address of the object. (The address in memory of the object created by keyword new.)
		TwoDShape variableTwoDShape;
		
		// It is a variable that can hold the object's memory address created by new, but it is not an object itself. 
		System.out.println(variableTwoDShape.name);
		
		// The keyword new created a (new) object and assigned its memory address to the variable that can hold it.
		TwoDShape referenceShape = new TwoDShape(1.0, "memory address");
		// Now, the variable is linked with an object. 
	}

}
