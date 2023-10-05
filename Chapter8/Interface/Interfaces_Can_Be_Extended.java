package Interface;

// One interface can extend another.
interface A{
	
	void meth1();
	void meth2();
}

// B now includes meth1() and meth2() - it adds meth3().
interface B extends A{  // B inherits A.
	void meth3();
}

// This class must implement all of A and B
class MyClass implements B{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Implement meth1(). ");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Implement meth2(). ");
	}

	@Override
	public void meth3() {
		// TODO Auto-generated method stub
		System.out.println("Implement meth3(). ");
	}
}


public class Interfaces_Can_Be_Extended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obMyClass = new MyClass();
		
		obMyClass.meth1();
		obMyClass.meth2();
		obMyClass.meth3();

	}

}
