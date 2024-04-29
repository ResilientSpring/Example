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

class D3 extends D1 {  // Derive from D1, not B.
	void who() {
		System.out.println("Third derivation");
	}
}

public class virtual_function {

	public static void main(String[] args) {
		

	}

}
