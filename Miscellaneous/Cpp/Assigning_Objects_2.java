package Cpp;

class Test2{
	
	int a, b;
	
	void set_ab(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	void show_ab() {
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);		
	}
}

public class Assigning_Objects_2 {

	public static void main(String[] args) {
		
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2();
		
		
		ob1.set_ab(10, 20);
		ob2.set_ab(0, 0);
		
		System.out.println("ob1 before assignment ob2 = ob1: ");
		ob1.show_ab();
		System.out.println("ob2 before assignment ob2 = ob1: ");
		ob2.show_ab();
		System.out.println();
		
		ob2 = ob1;             // assign ob1 to ob2
		
		System.out.println("ob1 after assignment: ");
		ob1.show_ab();
		System.out.println("ob2 after assignment: ");
		ob2.show_ab();
		
		System.out.println();
		
		ob1.set_ab(-1, -1);   // change ob1
		
		System.out.println("ob1 after changing ob1: ");
		ob1.show_ab();
		System.out.println("ob2 after changing ob1: ");
		ob2.show_ab();

	}

}
