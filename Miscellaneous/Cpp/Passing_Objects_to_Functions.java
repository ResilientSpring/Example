package Cpp;

class My_Class {

	int value;

	public My_Class(int value) {
		// TODO Auto-generated constructor stub

		this.value = value;
	}

	int get_value() {
		return value;
	}

	void set_value(int value) {
		this.value = value;
	}

	static void display(My_Class ob) {
		
		System.out.println(ob.value);

	}
	
	static void change(My_Class ob) {
		ob.set_value(100);
		System.out.println("Value of ob inside: ");
	}
}

public class Passing_Objects_to_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		My_Class a = new My_Class(20);
		
		System.out.println("Value of a before calling change(): ");
		
		My_Class.display(a);
		
		My_Class.change(a);
		
		System.out.println("Value of a after calling change(): ");
		
		My_Class.display(a);

	}

}
