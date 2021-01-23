// Demonstrate an overloaded constructor.

class MyClass5 {

	int x;

	public MyClass5() {
		// TODO Auto-generated constructor stub

		System.out.println("Inside MyClass().");
		x = 0;
	}

	MyClass5(int i) {

		System.out.println("Inside MyClass(int). ");

		x = i;
	}

	MyClass5(double d) {

		System.out.println("Inside MyClass(double). ");

		x = (int) d;
	}

	MyClass5(int i, int j) {

		System.out.println("Inside MyClass(int, int). ");

		x = i * j;
	}
}

public class OverloadConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass5 t1 = new MyClass5();
		MyClass5 t2 = new MyClass5(88);
		MyClass5 t3 = new MyClass5(17.23);
		MyClass5 t4 = new MyClass5(2, 4);
		
		System.out.println("t1.x: " + t1.x);
		System.out.println("t2.x: " + t2.x);
		System.out.println("t3.x: " + t3.x);
		System.out.println("t4.x: " + t4.x);

	}

}
