/* Methods with differing signatures are overloaded and not overridden. */

class Crossover {
	
	int i, j;
	
	public Crossover(int a, int b) {
		
		i = a;
		j = b;
	}
	
	// display i an j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
	
	// display i an j
	void show2() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class Slice extends Crossover {
	
	int k;
	
	public Slice(int a, int b, int c) {
		super(a, b);
		
		k = c;
	}
	
	// Because signature differ, this show() simply overloads show() in superclass Crossover.
	void show(String message) {
		System.out.println(message + k);
	}
	
	// display i an j
	void show2() {
		System.out.println("k: " + k );
	}
}

public class Override_versus_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Check if superclass type variable can access to the subclass non-overridden method.
		Crossover check_if_Superclass_variable_can_access = new Slice(1, 2, 3);
		
		// show() is simply overloaded.
		check_if_Superclass_variable_can_access.show();
		
		// show2() is overridden.
		check_if_Superclass_variable_can_access.show2();

	}

}
