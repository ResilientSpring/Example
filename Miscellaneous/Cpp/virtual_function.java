package Cpp;

class B{
	
	void who() {
		
		System.out.println("Base");
	}
}

class D1 extends B{
	
	void who() {
		
		System.out.println("First derivation");
	}
}

class D2 extends B{
	
	void who() {
		System.out.println("Second derivation");
	}
}

public class virtual_function {

	public static void main(String[] args) {
		

	}

}
