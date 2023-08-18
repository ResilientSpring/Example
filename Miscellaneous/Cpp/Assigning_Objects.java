package Cpp;

class Test{
	
	int a, b;
	
	void set_ab(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	void show_ab() {
		
		System.out.println("a is " + a + "\n");
		System.out.println("b is " + b + "\n");		
	}
}

public class Assigning_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test ob1 = new Test();
		Test ob2 = new Test();
		
		
		ob1.set_ab(10, 20);
		ob2.set_ab(0, 0);
		
		System.out.println("ob1 before assignment: ");
		ob1.show_ab();
		System.out.println("ob2 before assignment: ");
		ob2.show_ab();
		System.out.println();
		ob2 = ob1;             // assign ob1 to ob2

	}

}
